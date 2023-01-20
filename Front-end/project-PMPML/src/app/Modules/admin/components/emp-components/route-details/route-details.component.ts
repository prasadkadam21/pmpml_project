import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-route-details',
  templateUrl: './route-details.component.html',
  styleUrls: ['./route-details.component.css']
})
export class RouteDetailsComponent {
  Array:any[]=[];
  employee_driver!: string
  employee_conductor!: string
  busroute_id!: number
  employee_roll!: string
  bus_rname!: string
  bus_rn!: number
  bus_rdate!: string
  bus_start_rtime!: string
  bus_end_rtime!: string

  constructor(private http:HttpClient){
this.getBusRoute();
  }
  getBusRoute(){
    this.http.get("http://localhost:8585/busroute/getAll").subscribe((data:any)=>{
      console.log(data)
    this.Array=data
    })
  }
}
