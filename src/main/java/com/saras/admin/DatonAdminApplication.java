package com.saras.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatonAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatonAdminApplication.class, args);
		System.out.println("Daton admin started");
	}

}
