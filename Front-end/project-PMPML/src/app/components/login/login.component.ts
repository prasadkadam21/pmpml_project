import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  getArray!:any[];
admin_username!:string;
admin_password!:string;
constructor(private http:HttpClient,private route:Router){

}
get(){
  this.http.get("http://localhost:8585/admin/get").subscribe((result:any)=>{
    this.getArray=result;
  })
}
checkLogin(u_name:string,password:string)
{
  this.http.get("http://localhost:8585/admin/get").subscribe((result:any)=>{
    this.getArray=result;
  })
  
  if(u_name=="admin" && password=="admin")
  {
    this.route.navigate(['admin']); 
  }
  else{
    alert("wrong username and password")
  }
}
}
