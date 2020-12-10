package com.fonky.springboot.demo.mycoolapp.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fonky.springboot.demo.mycoolapp.entity.Employee;
import com.fonky.springboot.demo.mycoolapp.service.EmployeeService;

@Controller
@RequestMapping("/thyme")
public class ThymeleafController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/hello")
	public String sayHello(Model model) {
		model.addAttribute("date", new Date());
		
		return "helloworld";
	}
	
	@GetMapping("/list")
	public String listEmployees(Model model) {
		List<Employee> employees = employeeService.getEmployees();
		
		model.addAttribute("employees", employees);
		
		return "list-employees";
	}
}
