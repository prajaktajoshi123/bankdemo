package com.example.bankdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bankdemo.model.Transaction;
import com.example.bankdemo.model.User;
import com.example.bankdemo.repository.AccountRepository;
import com.example.bankdemo.repository.TransactionRepository;
import com.example.bankdemo.repository.userRepository;


@Service
public class LoginService {
	
	@Autowired
	userRepository userepository;
	
	
	public User validateUser(String username,String password)
	{
		
		User u=userepository.Login(username, password);
		return u;
	}
	

}
