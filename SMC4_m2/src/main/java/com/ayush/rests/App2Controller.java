package com.ayush.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App2Controller {

	@GetMapping("/tran")
	public String transaction() {
		return "Paisa Transaction";
	}
}
