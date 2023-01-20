import { NgModule } from '@angular/core';


import { AdminRoutingModule } from './admin-routing.module';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { HomeComponent } from './components/home/home.component';
import { FooterComponent } from './components/footer/footer.component';
import { HeaderComponent } from './components/header/header.component';
import { AboutComponent } from './components/about/about.component';
import { ContactComponent } from './components/contact/contact.component';
import { EmployeeComponent } from './components/employee/employee.component';
import { FormsModule } from '@angular/forms';
import { ShowEmployeesComponent } from './components/emp-components/show-employees/show-employees.component';
import { AddEmployeesComponent } from './components/emp-components/add-employees/add-employees.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { EmployeeDetailsComponent } from './components/emp-components/employee-details/employee-details.component';
import { BusServiceComponent } from './components/emp-components/bus-service/bus-service.component';
import { EmpProfileComponent } from './components/emp-components/emp-profile/emp-profile.component';
import { BusRoutesComponent } from './components/emp-components/bus-routes/bus-routes.component';


import { RouteDetailsComponent } from './components/emp-components/route-details/route-details.component';





@NgModule({
  declarations: [
    DashboardComponent,
    HomeComponent,
    FooterComponent,
    HeaderComponent,
    AboutComponent,
    ContactComponent,
    EmployeeComponent,
    ShowEmployeesComponent,
    AddEmployeesComponent,
    EmployeeDetailsComponent,
    BusServiceComponent,
    EmpProfileComponent,
    BusRoutesComponent,
  
    RouteDetailsComponent,
   
  
  ],
  imports: [
    
    AdminRoutingModule,
    CommonModule,
    NgbModule,
    FormsModule,
    HttpClientModule
  ]
})
export class AdminModule { }
