package com.ayush.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App2Controller {

	@GetMapping("/act")
	public String action() {
		return "Hiii action";
	}
}
