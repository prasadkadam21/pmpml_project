import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {
  employeeArray!:any[];
  emp_id!:number;
  emp_name!:string;
  emp_email!:string;
  emp_dob!:string;
  emp_gender!:string;
  emp_phone!:string;
  emp_address!:string;
  emp_roll!:string;
 constructor(private http:HttpClient){
 }

 save(){
let body={

  
  "employee_name":this.emp_name,
  "employee_email":this.emp_email,
  "employee_dob":this.emp_dob,
  "employee_gender":this.emp_gender,
  "employee_phone":this.emp_phone,
  "employee_roll":this.emp_roll
  ,"employee_address":this.emp_address
};


  
  this.http.post("http://localhost:8585/saveemployee",body,{responseType: 'text'}).subscribe((result:any)=>{
    console.log(result)
alert("save data")


this.emp_name="";

this.emp_email="";
this.emp_dob="";
this.emp_gender="";
this.emp_phone="";
this.emp_address=""
this.emp_roll="";

  });
 }
 
}
