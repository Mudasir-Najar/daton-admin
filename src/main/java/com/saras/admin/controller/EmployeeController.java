package com.saras.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.saras.admin.entity.Employee;
import com.saras.admin.service.EmployeeService;

@RestController
public class EmployeeController {

	// AutoWired employee class
	@Autowired
	EmployeeService employeeService;
	
	// creating a get mapping that retrieves all the user details from the database
		@GetMapping("/employee")
		private ResponseEntity<RestApiResponse<List<Employee>>> getAllEmployee() {
			return ResponseEntity.ok(RestApiResponse.<List<Employee>>builder().data(employeeService.getAllEmployee()).build());
		}
		
		// creating a mapping that retrieves the detail of employee
		@GetMapping("/employee/{employee-id}")
        private ResponseEntity<RestApiResponse<Employee>> getEmployee(@PathVariable("EmployeeId") long employeeId) {
	        return ResponseEntity.ok(RestApiResponse.<Employee>builder().data(employeeService.getEmployeeById(employeeId)).build());
		}
		
		@PostMapping("/employee")
		private String saveUser(@RequestBody Employee employee) {
			employeeService.saveOrUpdate(employee);
			return employee.getEmployeeName();
		}
		
		@GetMapping("/employee/email/{email}")
		private ResponseEntity<RestApiResponse<Employee>>getEmployeeByEmail(@PathVariable("email") String email) {
			return ResponseEntity
					.ok(RestApiResponse.<Employee>builder().data(employeeService.getEmployeeByEmail(email)).build());
	 }
}