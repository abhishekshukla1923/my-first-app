import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import{BlogPostComponent} from './blog-post/blog-post.component'
import{HomeComponent} from './home/home.component'
import { PostdetailsComponent } from './postdetails/postdetails.component';
import{RegisterComponent} from './register/register.component';
import{LoginComponent} from './login/login.component'
import { CategoryComponent } from './category/category.component';
import { CategorydetailsComponent } from './categorydetails/categorydetails.component';
const routes: Routes = [{path:'' ,component:HomeComponent},
  {path :'blog-post',component:BlogPostComponent},
  {path:'postdetails/:id',component:PostdetailsComponent},
  {path :'register',component:RegisterComponent},
  {path:'login',component: LoginComponent},
  {path :'category' ,component:CategoryComponent},
  {path:'categorydetails/:id',component :CategorydetailsComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
