import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent {

  employeeArray!:any[];

  employee_id!:number;
 employee_name:string='';
 employee_dob:string='';
 employee_gender:string='';
 employee_email:string='';
 employee_phone:string='';
 employee_address:string='';
 employee_roll:string='';
 constructor(private http:HttpClient){
  this.getDetails();
 }
getDetails(){

  this.http.get("http://localhost:8585/employee/get").subscribe((result:any)=>{
    console.log("data is fetched")
    this.employeeArray=result;
  })
}
 

  

}
