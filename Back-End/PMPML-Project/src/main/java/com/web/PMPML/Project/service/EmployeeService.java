package com.web.PMPML.Project.service;

import java.io.FileNotFoundException;
import java.util.List;

import com.web.PMPML.Project.model.Employee;

import net.sf.jasperreports.engine.JRException;

public interface EmployeeService {
    
    public List<Employee> GetAllEmp();

    public Employee getEmpById(int Employeeid);

    public String saveEmp(Employee employee);

    public Employee updateEmp(Employee employee,int Employeeid);

    public void empDeleteById(int employee_id);
    
    public String exportReport(String format)throws FileNotFoundException,JRException;

}
