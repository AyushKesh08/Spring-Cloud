package com.ayush.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ayush.entities.User;
import com.ayush.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/show_all")
	public Iterable<User> fetchAll(){
		return userService.fetchUser();
	}
	
	@PostMapping("/save_user")
	public String saveUser(@RequestBody User user) {
		
		userService.saveUser(user);
		
		return "User Saved Successfully.";
	}
}
