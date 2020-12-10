package com.fonky.springboot.demo.mycoolapp.service;

import java.util.List;

import com.fonky.springboot.demo.mycoolapp.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployees();
	
	public Employee getEmployee(int id);
	
	public void save(Employee employee);
	
	public void delete(int id);

}
