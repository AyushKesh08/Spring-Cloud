package com.ayush.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="SMC5-m2")
public interface M2Client {

	@GetMapping("/info")
	public String m2Act();
	
}
