package com.fonky.springboot.demo.mycoolapp.dao;

import java.util.List;

import com.fonky.springboot.demo.mycoolapp.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void save(Employee employee);
	
	public void deleteById(int id);
}
