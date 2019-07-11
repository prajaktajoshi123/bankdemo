package com.example.bankdemo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankdemo.model.Transaction;
import com.example.bankdemo.model.User;
import com.example.bankdemo.service.LoginService;

@RestController

public class LoginController {

	@Autowired
	LoginService logservice;

	@PostMapping("/login")
	public String Login(@RequestBody User u) {
		User us = logservice.validateUser(u.getName(), u.getPassword());

		if (us == null) {
			return "fail";
		}
		return "Success";
	}
}