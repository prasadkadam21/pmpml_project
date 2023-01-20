package com.web.PMPML.Project.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BusRoute {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int busroute_id;
    private String bus_rname;
    private int bus_rn;
    private String employee_driver;
    private String employee_conductor;
    private String bus_rdate;
    private String bus_start_rtime;
    private String bus_end_rtime;
    public BusRoute() {
    }
    public BusRoute(int bus_rn, String bus_rname, String employee_driver, String employee_conductor, String bus_rdate,
            String bus_start_rtime, String bus_end_rtime) {
        this.bus_rn = bus_rn;
        this.bus_rname = bus_rname;
        this.employee_driver = employee_driver;
        this.employee_conductor = employee_conductor;
        this.bus_rdate = bus_rdate;
        this.bus_start_rtime = bus_start_rtime;
        this.bus_end_rtime = bus_end_rtime;
    }
    public int getBus_rn() {
        return bus_rn;
    }
    public void setBus_rn(int bus_rn) {
        this.bus_rn = bus_rn;
    }
    public String getBus_rname() {
        return bus_rname;
    }
    public void setBus_rname(String bus_rname) {
        this.bus_rname = bus_rname;
    }
    public String getEmployee_driver() {
        return employee_driver;
    }
    public void setEmployee_driver(String employee_driver) {
        this.employee_driver = employee_driver;
    }
    public String getEmployee_conductor() {
        return employee_conductor;
    }
    public void setEmployee_conductor(String employee_conductor) {
        this.employee_conductor = employee_conductor;
    }
    public String getBus_rdate() {
        return bus_rdate;
    }
    public void setBus_rdate(String bus_rdate) {
        this.bus_rdate = bus_rdate;
    }
    public String getBus_start_rtime() {
        return bus_start_rtime;
    }
    public void setBus_start_rtime(String bus_start_rtime) {
        this.bus_start_rtime = bus_start_rtime;
    }
    public String getBus_end_rtime() {
        return bus_end_rtime;
    }
    public void setBus_end_rtime(String bus_end_rtime) {
        this.bus_end_rtime = bus_end_rtime;
    }
    @Override
    public String toString() {
        return "BusRoute [bus_rn=" + bus_rn + ", bus_rname=" + bus_rname + ", employee_driver=" + employee_driver
                + ", employee_conductor=" + employee_conductor + ", bus_rdate=" + bus_rdate + ", bus_start_rtime="
                + bus_start_rtime + ", bus_end_rtime=" + bus_end_rtime + "]";
    }

    
}
