package com.rm.SpringBootRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rm.SpringBootRest.model.Employee;
import com.rm.SpringBootRest.service.EmployeeService;

@RestController("/")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/user")
		public List<Employee> save(@RequestBody List<Employee> emp){
			return employeeService.save(emp);
		
		
	}
	
    
}
