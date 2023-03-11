import { Component, OnInit, } from '@angular/core';
import{Modal} from '../modal';
import {EmployeeService} from '../employee.service'
import { ActivatedRoute, Router } from '@angular/router';
import { Categorymodel } from '../categorymodel';
import { Observable } from 'rxjs';
import{DomSanitizer} from '@angular/platform-browser'


@Component({
  selector: 'app-blog-post',
  templateUrl: './blog-post.component.html',
  styleUrls: ['./blog-post.component.css']
})
export class BlogPostComponent implements OnInit {
  [x: string]: any;
  PostDetails :any =null;
  CategoryDetail!:Observable<Array<Categorymodel>>
  modal :Modal  =new Modal();
  categorymodel:Categorymodel = new Categorymodel();
  constructor(private employeeService:EmployeeService,private router:Router,public domsanitizer : DomSanitizer){
    //this.getPostdetails()
    
  }
  ngOnInit(): void {

    this.CategoryDetail =this.employeeService.getCategory();
  }
  userPost(){
    console.log(this.modal);
    this.employeeService.postUser(this.modal).subscribe(data=>{
      alert("successfull student is registered");
      this.router.navigateByUrl('/');
      //this.getPostdetails()
      },error =>alert("sorry student is not created")
    )

   }

//    getPostdetails(){
//     this.employeeService.getPosts().subscribe(data=>{
//       console.log(data);
//       this.PostDetails=data;
      
// },error => {
//       console.log(error);
//     }
    
//     )
//    }
  
  editorconfig ={
    base_url:'/tinymce',
    suffix: '.min',
    plugins:'autolink lists pagebreak style table save advhr advimage advlink emotions media noneditable nonbreaking'
    
    
  
  
  
  }

}
