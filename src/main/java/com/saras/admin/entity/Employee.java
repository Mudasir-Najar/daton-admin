package com.saras.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@Column
	private long id;
	@Column
	private String employeeName;
	@Column
	private String email;
	@Column
	private long mobileNumber;

	@Override
	public String toString() {
		return "Employee [employeeId=" + id + ", employeeName=" + employeeName + ", Email=" + email
				+ ", moblieNumber=" + mobileNumber + "]";
	}

	
	}

