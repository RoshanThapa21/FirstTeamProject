package com.rm.SpringBootRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rm.SpringBootRest.dao.EmployeeDAO;
import com.rm.SpringBootRest.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDAO employeeDao;
	
	public List<Employee> save(List<Employee> emp){
		return employeeDao.save(emp);
		
	}
	
	public Employee delete(Employee id) {
		return id;
		
	}
	
	public Employee find(Employee id){
		return id;
		
	}
	
}


