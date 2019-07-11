package com.example.bankdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bankdemo.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

}
