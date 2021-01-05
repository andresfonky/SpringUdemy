package com.fonky.springboot.demo.mycoolapp.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	// inject properties 
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	@GetMapping("/hello")
	public String sayHello() {
		return "HelloWorld! MyCoolApp and time is " + LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getDailyWorkOut() {
		return "Run a hard 5k!";
	}
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Today is your lucky day.";
	}
	
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach: " + this.coachName + ", Team: " + this.teamName;
	}

}
