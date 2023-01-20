
package com.web.PMPML.Project.service.Implemenntservice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.web.PMPML.Project.model.Employee;
import com.web.PMPML.Project.repo.EmployeeRepo;
import com.web.PMPML.Project.service.EmployeeService;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo eRepo; 

    @Override
    public List<Employee> GetAllEmp() {
        List<Employee> emplist= eRepo.findAll();
        return emplist;
    }

    @Override
    public Employee getEmpById(int Employeeid) {
       Employee emp=eRepo.findById(Employeeid).get();
        
        return emp;
    }
    @Override
    public String saveEmp(Employee employee) {
       eRepo.save(employee);
        return "save employee";
    }

  @Override
  public Employee updateEmp(Employee employee,int Employeeid) {
      Employee emp=eRepo.findById(Employeeid).get();
      emp.setEmployee_name(employee.getEmployee_name());
      emp.setEmployee_email(employee.getEmployee_email());
      emp.setEmployee_gender(employee.getEmployee_gender());
      emp.setEmployee_dob(employee.getEmployee_dob());
      emp.setEmployee_address(employee.getEmployee_address());
      emp.setEmployee_phone(employee.getEmployee_phone());

      eRepo.save(emp);
            return emp;
  }
   
  @Override
  public void empDeleteById(int employee_id) {
      // TODO Auto-generated method stub
      eRepo.deleteById(employee_id);
  }
  
  
  @Override
public String exportReport(String format) throws FileNotFoundException, JRException {
	  String path="C://Users//Marvel//Desktop//project//";
	List<Employee> employeelList=GetAllEmp();
	File file=ResourceUtils.getFile("classpath:Employee.jrxml");
	JasperReport jasperReport=JasperCompileManager.compileReport(file.getAbsolutePath());
	JRBeanCollectionDataSource ds=new JRBeanCollectionDataSource(employeelList);
	
	Map< String, Object> pMap=new HashMap<String,Object>();
	
	pMap.put("Employee","Empolyee Detail" );
	
	JasperPrint jasperPrint= JasperFillManager.fillReport(jasperReport, pMap,ds);
	if(format.equalsIgnoreCase("html")) {
		JasperExportManager.exportReportToHtmlFile(jasperPrint,path+"//Employees.html");
		
		
	}
	if(format.equalsIgnoreCase("pdf")) {
		JasperExportManager.exportReportToPdfFile(jasperPrint,path+"//Employees.pdf");
	}
	return "path : "+path;
}
}
