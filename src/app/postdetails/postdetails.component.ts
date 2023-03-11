import { Component,OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeService } from '../employee.service';
import { Modal } from '../modal';

@Component({
  selector: 'app-postdetails',
  templateUrl: './postdetails.component.html',
  styleUrls: ['./postdetails.component.css']
})
export class PostdetailsComponent implements OnInit {
  id:any ;
  modal!: Modal;
  
  constructor(private router:ActivatedRoute,private empservice: EmployeeService ){
    
    
    
  }
  ngOnInit() {
        this.router.params.subscribe(params =>{

        
       this.id =params['id'];
      });
      


    
    
       this.empservice.getPostDetails(this.id).subscribe((data:Modal)=>{
        console.log(data);
         this.modal =data;
         
      },(err:any)=>{
         console.log(err);

       }
       )
      }
    }


    
    
      

