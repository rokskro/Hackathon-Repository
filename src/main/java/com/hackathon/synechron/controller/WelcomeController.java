package com.hackathon.synechron.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome/{name}")
	public String sendWelcomeMessage(@PathVariable String name) {
		return "Hello there " + name;
	}
	
}
