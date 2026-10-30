package com.ayush.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App2Controller {

	@Autowired
	private Environment env;
	
	@GetMapping("/info")
	public String information() {
		
		String port = env.getProperty("server.port");
		
		return "Hiiiiii" + port;
	}
}
