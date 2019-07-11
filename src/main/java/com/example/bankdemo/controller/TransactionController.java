package com.example.bankdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankdemo.model.Transaction;
import com.example.bankdemo.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	TransactionService ts;
	
	/*
	 * @GetMapping("/getrecord/{id}") public Transaction getRecord(@PathVariable int
	 * id) { return ts.getUserTransaction(id); }
	 */
	
	@GetMapping("/getrecord/{id}")
	public String getRecord(@PathVariable int id) {
		return "Success";
	}
}
