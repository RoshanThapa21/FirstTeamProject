package com.rm.SpringBootRest.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rm.SpringBootRest.model.Employee;

public interface EmployeeRepo extends JpaRepository<Long, Employee> {

	List<Employee> saveAll(List<Employee> emp);


}
