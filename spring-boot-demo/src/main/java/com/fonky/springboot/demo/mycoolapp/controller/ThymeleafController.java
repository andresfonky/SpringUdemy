package com.fonky.springboot.demo.mycoolapp.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thyme")
public class ThymeleafController {

	@GetMapping("/hello")
	public String sayHello(Model model) {
		model.addAttribute("date", new Date());
		
		return "helloworld";
	}
}
