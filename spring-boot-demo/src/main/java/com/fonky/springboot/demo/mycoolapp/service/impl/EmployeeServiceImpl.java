package com.fonky.springboot.demo.mycoolapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fonky.springboot.demo.mycoolapp.dao.EmployeeRepository;
import com.fonky.springboot.demo.mycoolapp.entity.Employee;
import com.fonky.springboot.demo.mycoolapp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	//@Autowired
	//@Qualifier("employeeDAOJpa")
	//private EmployeeDAO employeeDAO;
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	//@Transactional //Included in JpaRepository
	public List<Employee> getEmployees() {
		List<Employee> employees = employeeRepository.findAllByOrderByLastNameAsc();
		return employees;
	}

	@Override
	public Employee getEmployee(int id) {
		Optional<Employee> result = employeeRepository.findById(id);
		
		Employee employee = null;
		if(result.isPresent()) {
			employee = result.get();
		} else {
			throw new RuntimeException("Did not find employee id - " + id);
		}
		
		return employee;
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void delete(int id) {
		employeeRepository.deleteById(id);
	}
}
