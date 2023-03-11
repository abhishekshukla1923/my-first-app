import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EmployeeService } from '../employee.service';
import {Registermodal} from '../registermodal'


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  
  [x: string]: any;
  RegisterDetails :any =null;
  modal :Registermodal = new Registermodal()
  constructor(private employeeService:EmployeeService,private router:Router){}
  ngOnInit(): void {}
  // userPost(){
  //   console.log(this.modal);
  //   this.employeeService.postRegister(this.modal).subscribe(data=>{
  //     alert("successfull student is registered");
  //     this.router.navigateByUrl('/');
      
  //     },error =>alert("sorry student is not created")
  //   )

  //  }


  


}
