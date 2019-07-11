package com.example.bankdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankdemo.model.Account;
import com.example.bankdemo.model.User;
import com.example.bankdemo.service.userService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	userService userservice;

	@PostMapping("/add")
	public User registerUser(@RequestBody User user)
	{
		return userservice.registerUser(user);
		
		}
	
	@GetMapping("/{id}")
	public User getUserInfo(@PathVariable int id)
	{
		return userservice.getUserInfo(id);
	}
}
