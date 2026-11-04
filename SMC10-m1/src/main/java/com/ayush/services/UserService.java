package com.ayush.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayush.entities.User;
import com.ayush.repos.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public void saveUser(User user) {
		userRepo.save(user);
	}
	
	public Iterable<User> fetchUser(){
		return userRepo.findAll();
	}
	
}
