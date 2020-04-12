package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class HelloController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/user")
	public List<User> getAllUser() {
		System.out.println("controller");
		System.setProperty("jdk.tls.trustNameService", "true");
		return userService.getAllUsers();
	}

}
