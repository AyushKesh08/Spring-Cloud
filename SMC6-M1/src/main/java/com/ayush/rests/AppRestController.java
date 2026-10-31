package com.ayush.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayush.feigns.M2Client;

@RestController
public class AppRestController {
	
	@Autowired
	private M2Client m2Client;

	@GetMapping("/pro")
	public String process() {
		
		String resp = m2Client.M2Info();
		String resp1 = m2Client.M2Action();
		
		return "Hello Process " + resp + resp1;
	}
}
