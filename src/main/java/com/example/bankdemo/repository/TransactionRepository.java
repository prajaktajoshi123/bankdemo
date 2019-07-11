package com.example.bankdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bankdemo.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>
{

}
