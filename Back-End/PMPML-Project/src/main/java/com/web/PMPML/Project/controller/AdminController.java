package com.web.PMPML.Project.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.PMPML.Project.model.Admin;
import com.web.PMPML.Project.repo.AdminRepo;
import com.web.PMPML.Project.service.AdminService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/admin")
public class AdminController {
  
    
   
    @Autowired
    AdminService aService;

    @GetMapping("/get")
    @ResponseBody
    public List<Admin> show(){
        List<Admin> list=aService.getAllAdmin();
        return list;
    }

    @PostMapping("/saveadmin")
    @ResponseBody
    public void saveEmployee(@RequestBody Admin admin){
       aService.saveAdmin(admin);
      
    }



    @PutMapping("/updateadmin/{admin_id}")
    @ResponseBody
    public Admin updateEmployee(@PathVariable("admin_id") int admin_id,@RequestBody Admin admin){
   
     
       Admin adm=  aService.updateAdminById(admin_id,admin);
       
         return adm;
    }

    @DeleteMapping("/deleteadmin/{admin_id}")
   @ResponseBody
    public void deleteEmployee(@PathVariable("admin_id") int admin_id){
     
           aService.deleteAdminById(admin_id);
         
    }

}
