import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './components/about/about.component';
import { ContactComponent } from './components/contact/contact.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { EmployeeComponent } from './components/employee/employee.component';
import { HomeComponent } from './components/home/home.component';
import { ShowEmployeesComponent } from './components/emp-components/show-employees/show-employees.component';
import { AddEmployeesComponent } from './components/emp-components/add-employees/add-employees.component';
import { EmployeeDetailsComponent } from './components/emp-components/employee-details/employee-details.component';
import { BusServiceComponent } from './components/emp-components/bus-service/bus-service.component';
import { EmpProfileComponent } from './components/emp-components/emp-profile/emp-profile.component';
import { BusRoutesComponent } from './components/emp-components/bus-routes/bus-routes.component';
import { RouteDetailsComponent } from './components/emp-components/route-details/route-details.component';



const routes: Routes = [
  {path:'',component:DashboardComponent,
  children:[
    {path:'home',component:HomeComponent},
  {path:'about',component:AboutComponent},
  {path:'manage',component:EmployeeComponent,children:[
    
    {path:'show-employee',component:ShowEmployeesComponent},
    {path:'add-employee',component:AddEmployeesComponent},
    {path:'employee-details',component:EmployeeDetailsComponent},
    {path:'profile/:id',component:EmpProfileComponent},
    
  {path:'bus-service',component:BusServiceComponent},
  {path:'bus-route',component:BusRoutesComponent},
  {path:'route-details',component:RouteDetailsComponent}
  ]},
  {path:'contact',component:ContactComponent},
  {path:'',redirectTo:'/admin/home',pathMatch:'full'}
]},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AdminRoutingModule { }
