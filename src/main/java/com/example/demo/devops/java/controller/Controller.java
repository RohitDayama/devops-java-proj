package com.example.demo.devops.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/h")
	public String display() {
		
		return "Hello World!";
	}

}
