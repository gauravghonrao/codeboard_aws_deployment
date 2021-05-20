package com.cloudDemo.cloudDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

	@GetMapping("/")
	public String getStatus() {
		return "working";
	}
}
