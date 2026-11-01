package com.ayush.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/m1")
public class AppRestController {
	
	@GetMapping("/pro")
	public String process() {
		
		return "Hello pro";
	}
	
	@GetMapping("/info")
	public String information() {
		
		return "Hello info from m1";
	}
	
}
