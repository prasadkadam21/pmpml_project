import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-show-employees',
  templateUrl: './show-employees.component.html',
  styleUrls: ['./show-employees.component.css']
})
export class ShowEmployeesComponent {
 Array:any[]=[];
 employee_id!:number;
 employee_name:string='';
 employee_dob:string='';
 employee_gender:string='';
 employee_email:string='';
 employee_phone:string='';
 employee_address:string='';
 employee_roll:string='';

 
constructor(private http:HttpClient){
this.fetch();
}
 fetch(){
  this.http.get("http://localhost:8585/employee/get").subscribe((result:any)=>{
    this.Array=result;
    console.log(result);
    
  })
}
 
 update(arr:any){
  this.employee_id=arr.employee_id
  this.employee_name=arr.employee_name
  this.employee_dob=arr.employee_dob
 this.employee_gender=arr.employee_gender
  this.employee_email=arr.employee_email
  this.employee_phone=arr.employee_phone
  this.employee_address=arr.employee_address
  this.employee_roll=arr.employee_roll
 }

 put(e_id:number){
  let body={
    'employee_id':this.employee_id,
    'employee_name':this.employee_name,
    'employee_dob':this.employee_dob,
    'employee_gender':this.employee_gender,
    'employee_email':this.employee_email,
    'employee_phone':this.employee_phone,
    'employee_address':this.employee_address,
    'employee_roll':this.employee_roll
  }

  this.http.put("http://localhost:8585/employee/updateemployee"+"/"+e_id,body).subscribe((result)=>{
    console.log(result);
    alert("update data");
    this.fetch();
  })
 }
 deleteEmp(id:number){


this.http.delete("http://localhost:8585/employee/deleteemployee"+"/"+id).subscribe((result)=>
{
  console.log(result)
  alert("Delete")
  this.fetch();
})
 }
}
