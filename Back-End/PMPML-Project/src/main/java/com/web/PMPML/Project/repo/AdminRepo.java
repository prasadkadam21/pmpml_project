package com.web.PMPML.Project.repo;


import org.springframework.data.jpa.repository.JpaRepository;


import com.web.PMPML.Project.model.Admin;

public interface AdminRepo extends JpaRepository<Admin,Integer> {
    
    
}
