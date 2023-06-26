package com.project.EmployeeSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.EmployeeSystem.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{
	
}
