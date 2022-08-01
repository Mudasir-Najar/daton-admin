package com.saras.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	private String getHello() {

		System.out.println("Hellow World");
		return "hello world";

	}

}
