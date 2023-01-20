import { HttpClient } from '@angular/common/http';
import { Component,OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-emp-profile',
  templateUrl: './emp-profile.component.html',
  styleUrls: ['./emp-profile.component.css']
})
export class EmpProfileComponent implements OnInit {
  employee_id!:number;
  employee_name:string='';
  employee_dob:string='';
  employee_gender:string='';
  employee_email:string='';
  employee_phone:string='';
  employee_address:string='';
  employee_roll:string='';
id!:any;
 body:any={};
  constructor(private activeroute:ActivatedRoute,private http:HttpClient){

  }
 ngOnInit(): void {
    this.id= this.activeroute.snapshot.paramMap.get("id");
    this.employee_id=+this.id;
    this.getprofile(this.employee_id);
 }
 
 getprofile(id:number){
 this.http.get("http://localhost:8585/employee/getemployee"+"/"+id).subscribe((data)=>{
this.body=data;
 })
 }
}
