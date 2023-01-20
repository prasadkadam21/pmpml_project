package com.web.PMPML.Project.controller;

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

import com.web.PMPML.Project.model.Employee;

import com.web.PMPML.Project.service.Implemenntservice.EmployeeServiceImpl;

import net.sf.jasperreports.engine.JRException;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/employee")
public class EmployeeController {
    
    

@Autowired 
private  EmployeeServiceImpl  emp_si;
    
    @GetMapping("/get")
    @ResponseBody
    public List<Employee> show(){
        List<Employee> list=emp_si.GetAllEmp();
        return list;
    }

    @GetMapping("/getemployee/{employee_id}")
    @ResponseBody
    public Employee show(@PathVariable("employee_id")int employee_id){
        Employee emp=emp_si.getEmpById(employee_id);
        return emp;
    }
    
    @PostMapping("/saveemployee")
    @ResponseBody
    public String saveEmployee(@RequestBody Employee employee){
       emp_si.saveEmp(employee);
       return "save";
    }


    @PutMapping("/updateemployee/{employee_id}")
    @ResponseBody
    public Employee updateEmployee(@RequestBody Employee employee,@PathVariable("employee_id") int employee_id){
        Employee emp=emp_si.updateEmp(employee,employee_id);
       
         return emp;
    }

    @DeleteMapping("/deleteemployee/{employee_id}")
   @ResponseBody
    public void deleteEmployee(@PathVariable("employee_id") int employee_id){
     
           emp_si.empDeleteById(employee_id);
         
    }
    
    @GetMapping("/export/{format}")
    @ResponseBody
    public String exportReport(@PathVariable("format") String format) throws FileNotFoundException, JRException{
        
        return emp_si.exportReport(format);
    }
    }
