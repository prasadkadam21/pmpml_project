import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-admin-register',
  templateUrl: './admin-register.component.html',
  styleUrls: ['./admin-register.component.css']
})
export class AdminRegisterComponent {
  
  employeeArray!:any[];
  emp_id!:number;
  emp_name!:string;
  emp_email!:string;
  emp_password!:string;
  emp_username!:string;
  emp_gender!:string;
  emp_phone!:string;
  emp_address!:string;

 constructor(private http:HttpClient){
 }

 save(){
let body={

  
  "admin_name":this.emp_name,
  "admin_username":this.emp_username,
  "admin_password":this.emp_password,
  "admin_gender":this.emp_gender,
  "admin_phone":this.emp_phone,
  "admin_email":this.emp_email
  ,"admin_address":this.emp_address
};


  
  this.http.post("http://localhost:8585/admin/saveadmin",body).subscribe((result:any)=>{
    console.log(result)
alert("save data")


this.emp_name="";
this.emp_email="";
this.emp_password="";
this.emp_gender="";
this.emp_phone="";
this.emp_address="";
this.emp_username="";

  });
 }
 
}
