import { Component,OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Modal } from '../modal';
import { EmployeeService } from '../employee.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-categorydetails',
  templateUrl: './categorydetails.component.html',
  styleUrls: ['./categorydetails.component.css']
})
export class CategorydetailsComponent implements OnInit {

  PostDetails1!: Observable<Array<Modal>>;
  id:any
  model1!:Modal
  constructor(private router:ActivatedRoute,private employeeService:EmployeeService){
    
    
  }
  ngOnInit(): void {

    this.router.params.subscribe(params =>{

        
      this.id =params['id'];
     });

    this.PostDetails1= this.employeeService.getblogposts(this.id);
    //.subscribe((data:Modal)=>{
       //console.log(data);
       // this.modal =data;
     
    // },(err:any)=>{
      //  console.log(err);

     // }
      //)

    
  }
  

}
