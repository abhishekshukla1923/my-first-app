import { Component,OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { HttpClient } from '@angular/common/http';
import { Categorymodel } from '../categorymodel';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit {
  CategoryDetails :any =null;
  categorymodel:Categorymodel =new Categorymodel();
  
  constructor(private employeeservice:EmployeeService,private http:HttpClient,private router:Router){
    this.getCategory()}
  ngOnInit(): void {}
  PostCategory(){
    this.employeeservice.postCategory(this.categorymodel).subscribe(data=>{
      console.log(data)
      this.router.navigateByUrl('/blog-post');
      alert("successfull student is registered");
      this.getCategory()

    },error=>{
      alert("not added category")
    })


  }
  getCategory(){
    this.employeeservice.getCategory().subscribe(data=>
     { 
      console.log(data);
      this.CategoryDetails= data;
      console.log("fetch successfully")
      
      },error=>{
        console.log(error);
      })
  }

}
