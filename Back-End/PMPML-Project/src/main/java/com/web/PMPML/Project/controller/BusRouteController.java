package com.web.PMPML.Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.PMPML.Project.model.BusRoute;
import com.web.PMPML.Project.service.BusRouteService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/busroute")
public class BusRouteController {
    
@Autowired
BusRouteService bService;

@GetMapping("/getAll")
@ResponseBody
public List<BusRoute> getAll() {
    // TODO Auto-generated method stub
  List<BusRoute> brlist=bService.getAll();
    return brlist;
}


@PostMapping("/save")
@ResponseBody
public void save(@RequestBody BusRoute busRoute){
    bService.save(busRoute);
}


 @PutMapping("/update/{busroute_id}")
 @ResponseBody
    public BusRoute updateByid(@PathVariable("busroute_id")int busroute_id,@RequestBody BusRoute busRoute) {
        // TODO Auto-generated method stub 
        BusRoute br=bService.update(busroute_id,busRoute);
        return br;
    }


    @DeleteMapping("/delete/{busroute_id}")
    public void deleteByid(@PathVariable("busroute_id")int busroute_id) {
        bService.delete(busroute_id);
        // TODO Auto-generated method stub
        
    }
}
