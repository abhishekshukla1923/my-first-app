import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BlogPostComponent } from './blog-post/blog-post.component';
import { HomeComponent } from './home/home.component';
import {FormsModule} from '@angular/forms';
import {EditorModule,TINYMCE_SCRIPT_SRC} from '@tinymce/tinymce-angular'
import{HttpClientModule, HTTP_INTERCEPTORS} from '@angular/common/http'
import{ReactiveFormsModule} from '@angular/forms';
import { PostdetailsComponent } from './postdetails/postdetails.component';
import { HeaderComponent } from './header/header.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { CategoryComponent } from './category/category.component';
import { CategorydetailsComponent } from './categorydetails/categorydetails.component'


@NgModule({
  declarations: [
    AppComponent,
    BlogPostComponent,
    HomeComponent,
    PostdetailsComponent,
    HeaderComponent,
    RegisterComponent,
    LoginComponent,
    CategoryComponent,
    CategorydetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    EditorModule,
    HttpClientModule,ReactiveFormsModule





  ],
  providers: [{provide :TINYMCE_SCRIPT_SRC,useValue:'tinymce/tinymce.min.js'}
  // {provide:HTTP_INTERCEPTORS,useClass:HttpClientInterceptor,multi:true}
],
  bootstrap: [AppComponent]
})
export class AppModule { }
