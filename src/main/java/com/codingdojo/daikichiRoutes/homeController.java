package com.codingdojo.daikichiRoutes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/daikichi")
public class homeController {

	@RequestMapping("")
	public String welcome() {
		return "Welcome!";
	}

	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endavors";
	}

	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas";
	}
	
	@GetMapping("Honolulu")
	public String travel() {
		return "Welcome to Honolulu";
	}

	@GetMapping("/lotto/{id}")
	public String getById(@PathVariable("id") Long id) {
		if(id % 2 == 0) {
		return "You will take a grand journey in the future be be aware of tempting offers";
	}	else {
		return "You have enjoyed the fruits of your labor";
	}

	}
}
