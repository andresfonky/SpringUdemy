package com.fonky.springboot.demo.mycoolapp.rest;

/*import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fonky.springboot.demo.mycoolapp.entity.Employee;
import com.fonky.springboot.demo.mycoolapp.service.EmployeeServiceLegacy;*/

//@RestController
//@RequestMapping("/legacy/api")
public class EmployeeRestControllerLegacy {
	
	/*private EmployeeServiceLegacy employeeService;
	
	@Autowired
	public EmployeeRestControllerLegacy(EmployeeServiceLegacy employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id) {
		Employee employee = employeeService.getEmployee(id);
		
		if(employee == null) {
			throw new RuntimeException("Employee id not found - " + id);
		}
		
		return employeeService.getEmployee(id);
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		employee.setId(0);
		employeeService.save(employee);
		
		return employee;
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		employeeService.save(employee);
		
		return employee;
	}
	
	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable int id) {
		Employee employee = employeeService.getEmployee(id);
		
		if(employee == null) {
			throw new RuntimeException("Employee id not found - " + id);
		}
		
		employeeService.delete(id);
		
		return "Deleted employee id - " + id;
	}*/
}
