package com.ayush.feigns;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="SMC6-M2")
public interface M2Client {
	
	@GetMapping("/info")
	public String M2Info();
	
	@PostMapping("/act")
	public String M2Action();
}
