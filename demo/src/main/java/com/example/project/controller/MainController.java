package com.example.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/")
	public String Home() {
		System.out.println("hehehehehehe");
		return "hehehee";
	}

	@GetMapping("/book")
	public String Book() {
		System.out.println("Jana..........");
		return "jana";
	}
	
	@PostMapping("/book")
	public String Book(@RequestBody String new1) {
		System.out.println(new1+"Jana..........");
		return new1+" Chaman";
	}
	

}
