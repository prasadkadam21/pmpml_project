package com.web.PMPML.Project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    private int employee_id;
    private String employee_name;
    private String employee_dob;
    private String employee_gender;
    private String employee_email;
    private String employee_phone;
    private String employee_address;
    private String employee_roll;
    public Employee() {
    }
   
    public Employee(int employee_id, String employee_name, String employee_dob, String employee_gender,
            String employee_email, String employee_phone, String employee_address, String employee_roll) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_dob = employee_dob;
        this.employee_gender = employee_gender;
        this.employee_email = employee_email;
        this.employee_phone = employee_phone;
        this.employee_address = employee_address;
        this.employee_roll = employee_roll;
    }


    public int getEmployee_id() {
        return employee_id;
    }
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
    public String getEmployee_name() {
        return employee_name;
    }
    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }
    public String getEmployee_dob() {
        return employee_dob;
    }
    public void setEmployee_dob(String employee_dob) {
        this.employee_dob = employee_dob;
    }
    public String getEmployee_gender() {
        return employee_gender;
    }
    public void setEmployee_gender(String employee_gender) {
        this.employee_gender = employee_gender;
    }
    public String getEmployee_email() {
        return employee_email;
    }
    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }
    public String getEmployee_phone() {
        return employee_phone;
    }
    public void setEmployee_phone(String employee_phone) {
        this.employee_phone = employee_phone;
    }
    public String getEmployee_roll() {
        return employee_roll;
    }
    
    public void setEmployee_roll(String employee_roll) {
        this.employee_roll = employee_roll;
    }
   
 

    public String getEmployee_address() {
        return employee_address;
    }

    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }

    @Override
    public String toString() {
        return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_dob="
                + employee_dob + ", employee_gender=" + employee_gender + ", employee_email=" + employee_email
                + ", employee_phone=" + employee_phone + ", employee_address=" + employee_address + ", employee_roll="
                + employee_roll + "]";
    }

    

}
