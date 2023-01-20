package com.web.PMPML.Project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int admin_id;
    private String admin_name;
    @Column(unique = true)
    private String admin_username;
    private String admin_password;
    private String admin_gender;
    private String admin_phone;
    private String admin_email;
    private String admin_address;
    public Admin() {
    }
    public Admin(int admin_id, String admin_name, String admin_username, String admin_password, String admin_gender,
            String admin_phone,String admin_email, String admin_address) {
        this.admin_id = admin_id;
        this.admin_name = admin_name;
        this.admin_username = admin_username;
        this.admin_password = admin_password;

        this.admin_gender = admin_gender;
        this.admin_phone = admin_phone;
        this.admin_email = admin_email;
        this.admin_address = admin_address;
    }
     public String getAdmin_email() {
        return admin_email;
    }
    public void setAdmin_email(String admin_email) {
        this.admin_email = admin_email;
    }
    public int getAdmin_id() {
        return admin_id;
    }
    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }
    public String getAdmin_name() {
        return admin_name;
    }
    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }
    public String getAdmin_username() {
        return admin_username;
    }
    public void setAdmin_username(String admin_username) {
        this.admin_username = admin_username;
    }
    public String getAdmin_password() {
        return admin_password;
    }
    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }
    public String getAdmin_gender() {
        return admin_gender;
    }
    public void setAdmin_gender(String admin_gender) {
        this.admin_gender = admin_gender;
    }
    public String getAdmin_phone() {
        return admin_phone;
    }
    public void setAdmin_phone(String admin_phone) {
        this.admin_phone = admin_phone;
    }
    public String getAdmin_address() {
        return admin_address;
    }
    public void setAdmin_address(String admin_address) {
        this.admin_address = admin_address;
    }
    @Override
    public String toString() {
        return "Admin [admin_id=" + admin_id + ", admin_name=" + admin_name + ", admin_username=" + admin_username
                + ", admin_password=" + admin_password + ", admin_gender=" + admin_gender + ", admin_phone="
                + admin_phone + ", admin_email=" + admin_email + ", admin_address=" + admin_address + "]";
    }


    
}
