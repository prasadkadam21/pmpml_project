import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminRegisterComponent } from './components/admin-register/admin-register.component';
import { LoginComponent } from './components/login/login.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';



const routes: Routes = [
{path:'Login',component:LoginComponent},
{path:'register',component:AdminRegisterComponent},
{path:'',redirectTo:'/Login',pathMatch:'full'},
{path:'admin',loadChildren:()=>import('./Modules/admin/admin.module').then((m)=>m.AdminModule)}, //lazy loading
{path:'**',component:PageNotFoundComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
