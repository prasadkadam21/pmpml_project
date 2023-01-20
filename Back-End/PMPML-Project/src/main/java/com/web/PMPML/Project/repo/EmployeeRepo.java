package com.web.PMPML.Project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.PMPML.Project.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    
}
