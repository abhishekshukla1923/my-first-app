import { Component,OnInit, SecurityContext } from '@angular/core';
import {ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { EmployeeService } from '../employee.service';
import { Modal } from '../modal';
import { Categorymodel } from '../categorymodel';
import { Blogpostmodel } from '../blogpostmodel';
import { DomSanitizer, SafeHtml } from '@angular/platform-browser';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{
  categorymodel:Categorymodel = new Categorymodel();
  modal :Modal  =new Modal();
  modal1!: Modal;
  id:any;

  //id:any ;
  blogmodel:Blogpostmodel = new Blogpostmodel();
  PostDetails!: Observable<Array<Modal>>;
  CategoryDetails!:Observable<Array<Categorymodel>>
  //content: any;

  
  constructor(private router:ActivatedRoute,private employeeService:EmployeeService){
    
    
  }
  ngOnInit() {
    this.PostDetails=this.employeeService.getPosts();
    this.CategoryDetails =this.employeeService.getCategory();

    
    
   
  }



    
      
  }

  // postingblog(){
  //   console.log(this.blogmodel);
  //   this.employeeService.postblog(this.blogmodel).subscribe(data=>
  //     {
  //       console.log(data);
  //         alert("blogg added successfully")
  //     },error=>{
  //       alert("not succsss fully added")
  //     }

  //   )
  // }



 




