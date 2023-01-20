import { HttpClient, HttpResponse } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-bus-routes',
  templateUrl: './bus-routes.component.html',
  styleUrls: ['./bus-routes.component.css']
})
export class BusRoutesComponent {
  employee: any = {}
  employee_name!: string
  employee_Conductor!: string
  employee_id!: number
  employee_roll!: string
  bus_rname!: string
  bus_rn!: number
  bus_rdate!: string
  bus_start_rtime!: string
  bus_end_rtime!: string

  
  constructor(private http: HttpClient) {

  }
  getbyid(id: number) {

    this.http.get("http://localhost:8585/employee/getemployee" + "/" + id).subscribe((data: any) => {
      console.log(data)
      this.employee = data
    })

  }
  submit(){
let body={
        "bus_rname": this.bus_rname,
        "bus_rn": this.bus_rn,
        "employee_driver": this.employee_name,
        "employee_conductor": this.employee_Conductor,
        "bus_rdate":this.bus_rdate,
        "bus_start_rtime": this.bus_start_rtime,
        "bus_end_rtime":this.bus_end_rtime
}
 this.http.post("http://localhost:8585/busroute/save",body).subscribe((data)=>{
  alert("save")
 })
  }
}
