import { Component } from '@angular/core';
import { Route, Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {
  constructor(private  route:Router){

  }
gotoLogin(){
  
}
}
