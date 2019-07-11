package com.example.bankdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.bankdemo.model.User;


public interface userRepository extends JpaRepository<User, Integer>{

	@Query("select u from User u where u.name = :username and u.password =:password")
	public User Login(@Param("username") String username,@Param("password") String password);
	
}
