package com.saras.admin.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.saras.admin.entity.Employee;
  
public interface EmployeeRepository extends CrudRepository<Employee, Long> {


	

	Optional<Employee> getEmployeeByEmail(String email);


}

