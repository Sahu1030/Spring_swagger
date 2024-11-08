package com.swagger.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SwagerController {
	
	@GetMapping("/get")
	public String getMethodName() {
		System.out.println("checking!");
		return "Welcome to swagger";
	}

	

}
