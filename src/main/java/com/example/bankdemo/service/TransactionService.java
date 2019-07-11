package com.example.bankdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bankdemo.model.Transaction;
import com.example.bankdemo.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	TransactionRepository transactionrepository;
	
	/*public List<Transaction>  getUserTransaction(int uid)
	{
		List<Transaction> Arra
	
}*/
}
 