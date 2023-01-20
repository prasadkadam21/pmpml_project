package com.web.PMPML.Project.service.Implemenntservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.web.PMPML.Project.model.BusRoute;
import com.web.PMPML.Project.repo.BusRouteRepo;
import com.web.PMPML.Project.service.BusRouteService;

@Service
public class BusRouteServiceImpl implements BusRouteService {
    @Autowired
    BusRouteRepo busRouteRepo;

    @Override
    public List<BusRoute> getAll() {
        // TODO Auto-generated method stub
        List<BusRoute> brlist = busRouteRepo.findAll();
        return brlist;
    }

    @Override
    public void save(BusRoute busRoute) {
        busRouteRepo.save(busRoute);
        // TODO Auto-generated method stub

    }

    @Override
    public BusRoute update(int busroute_id, BusRoute busRoute) {
        // TODO Auto-generated method stub
        BusRoute br=busRouteRepo.findById(busroute_id).get();
        br.setBus_rname(busRoute.getBus_rname());
        br.setBus_rn(busRoute.getBus_rn());
        br.setEmployee_driver(busRoute.getEmployee_driver());
        br.setEmployee_conductor(busRoute.getEmployee_conductor());
        br.setBus_rdate(busRoute.getBus_rdate());
        br.setBus_start_rtime(busRoute.getBus_start_rtime());
        br.setBus_end_rtime(busRoute.getBus_end_rtime());
        busRouteRepo.save(br);
        return br;
    }


    @Override
    public void delete(int busroute_id) {
        busRouteRepo.deleteById(busroute_id);
        // TODO Auto-generated method stub    
    }
}
