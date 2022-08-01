package com.saras.admin.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.saras.admin.entity.Employee;
import com.saras.admin.entity.User;
import com.saras.admin.exception.AppException;
import com.saras.admin.exception.ResponseCodeEnum;
import com.saras.admin.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	// getting all employee by using the method findAll() of crudRepository
	public List<Employee> getAllEmployee() {
		List<Employee> Employee = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(Employee1 -> Employee.add(Employee1));
		return Employee;
	}

	// getting a specific record by using the method findById() of CrudRepository
	public Employee getEmployeeById(long employeeId) {
		return employeeRepository.findById(employeeId).get();
	}

	public void saveOrUpdate(Employee employee) {
		employeeRepository.save(employee);
	}

	public Employee getEmployeeByEmail(String email) {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployeeByEmail(email)
				.orElseThrow(()-> new AppException(ResponseCodeEnum.EMPLOYEE_EMAIL_NOT_FOUND));	
	}
		
}