package com.rm.SpringBootRest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rm.SpringBootRest.model.Employee;
import com.rm.SpringBootRest.repository.EmployeeRepo;

@Repository
public class EmployeeDAO {
    
	@Autowired
	EmployeeRepo employeeRepo;
	
	public List<Employee> save(List<Employee> emp){
		return employeeRepo.saveAll(emp);
		
	}
	
	public Employee delete(Employee id) {
		return id;
		
	}
	
	public Employee find(Employee id){
		return id;
		
	}
	
}
