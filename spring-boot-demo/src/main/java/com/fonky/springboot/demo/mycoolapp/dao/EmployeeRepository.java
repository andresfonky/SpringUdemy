package com.fonky.springboot.demo.mycoolapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fonky.springboot.demo.mycoolapp.entity.Employee;

@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// Example Url: pagination and sorting
	//http://localhost:8080/mycoolapp/magic-api/members/?page=0&sort=firstName,desc

	public List<Employee> findAllByOrderByLastNameAsc();
}
