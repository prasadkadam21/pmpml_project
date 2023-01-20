package com.web.PMPML.Project.repo;
import org.springframework.data.jpa.repository.JpaRepository;


import com.web.PMPML.Project.model.BusRoute;
public interface BusRouteRepo extends JpaRepository<BusRoute,Integer>{
    
}
