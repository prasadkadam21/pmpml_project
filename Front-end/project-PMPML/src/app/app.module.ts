import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import {HttpClientModule} from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { LoginComponent } from './components/login/login.component';
import { AdminRegisterComponent } from './components/admin-register/admin-register.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';
import { AdminComponent } from './Modules/admin/admin.component';
import { CommonModule } from '@angular/common';




@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AdminRegisterComponent,
    PageNotFoundComponent,
    AdminComponent,

  ],
  imports: [
    BrowserModule,
    CommonModule,
    AppRoutingModule,
    NgbModule,
    HttpClientModule,
    FormsModule,
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
