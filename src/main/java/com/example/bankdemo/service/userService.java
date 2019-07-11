package com.example.bankdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bankdemo.model.Account;
import com.example.bankdemo.model.User;
import com.example.bankdemo.repository.AccountRepository;
import com.example.bankdemo.repository.userRepository;


@Service
public class userService {
	
	@Autowired
	userRepository userepository;
	
	@Autowired
	AccountRepository accountrepository;
	
	public User registerUser(User user)
	{
		userepository.save(user);
		Account account=new Account();
		account.setAccno(user.getUid());
		account.setAccount_holder_name(user.getName());
		account.setAccount_type("SAVINGS");
		account.setAmount("10000");
		
		 accountrepository.save(account);
		 
		 return user;
	}

	
	public User getUserInfo(int id)
	{  
		java.util.Optional<User> users = userepository.findById(id);
		
		if(users.isPresent()) {
			users.get();
		}
		return null;
	}
}
