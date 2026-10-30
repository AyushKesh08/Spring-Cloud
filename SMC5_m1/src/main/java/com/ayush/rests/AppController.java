package com.ayush.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayush.feign.M2Client;

@RestController
public class AppController {

	@Autowired
	private M2Client m2Client;
	
	@GetMapping("/pro")
	public String process() {
		
		String resp = m2Client.m2Act();
		
		return "Hello" + resp;
	}
}
