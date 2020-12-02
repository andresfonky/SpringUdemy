package com.fonky.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fonky.springdemo.entity.Customer;
import com.fonky.springdemo.exception.CustomerNotFoundException;
import com.fonky.springdemo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		return customerService.getCustomers();
	}
	
	@GetMapping("/customers/{customerId}")
	public Customer getCustomer(@PathVariable int customerId){
		Customer c = customerService.getCustomer(customerId);
		
		if(c == null) {
			throw new CustomerNotFoundException("Customer id not found - " + customerId);
		}
		
		return c;
	}
	
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer c) {
		c.setId(0);
		customerService.saveCustomer(c);
		
		return c;
	}
	
	@PutMapping("/customers")
	public Customer putCustomer(@RequestBody Customer c) {
		customerService.saveCustomer(c);
		
		return c;
	}
	
	@DeleteMapping("/customers/{customerId}")
	public String deleteCustomer(@PathVariable int customerId) {
		Customer c = customerService.getCustomer(customerId);
		
		if(c == null) {
			throw new CustomerNotFoundException("Customer id not found - " + customerId);
		}
		
		customerService.deleteCustomer(customerId);
		
		return "Deleted customer id - " + customerId;
	}
}
