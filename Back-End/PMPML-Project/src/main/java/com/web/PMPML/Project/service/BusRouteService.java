package com.web.PMPML.Project.service;

import java.util.List;

import com.web.PMPML.Project.model.BusRoute;

public interface BusRouteService {
    
    public List<BusRoute> getAll();

    public void save(BusRoute busRoute);


    public BusRoute update(int busroute_id,BusRoute busRoute);

    public void  delete(int busroute_id);

}
