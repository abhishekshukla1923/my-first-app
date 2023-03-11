import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Modal } from './modal';
import {Registermodal} from './registermodal'
import { Categorymodel } from './categorymodel';
import { Blogpostmodel } from './blogpostmodel';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  //basUrl:string  = "http://carrieradda.ap-south-1.elasticbeanstalk.com/india";

  constructor(private httpClient :HttpClient) { }
  postUser(modal:Modal): Observable<Object>{{
    console.log(modal);
    return this.httpClient.post("http://localhost:5002/blogpost",modal);

  }
  }
  public getPosts():Observable<Array<Modal>>{
    return this.httpClient.get<Array<Modal>>("http://localhost:5002/blogpost")
  }
  public getPostDetails(id:any):Observable<Modal>{
    return this.httpClient.get<Modal>('http://localhost:5002/blogpost/'+id);
  
  }
  // public postRegister(modals1:Registermodal):Observable<Object>{{
  //   console.log(modals1);
  //   return this.httpClient.post('http://localhost:5002/register',modals1);

  // }
  
  public postCategory(categorymodel:Categorymodel):Observable<Object>{{
    return this.httpClient.post("http://localhost:5002/category",categorymodel);


  }}
  public getCategory():Observable<Array<Categorymodel>>{
    return this.httpClient.get<Array<Categorymodel>>("http://localhost:5002/category");
}


public getblogposts(id1:any):Observable<Array<Modal>>{
  return this.httpClient.get<Array<Modal>>("http://localhost:5002/category/"+id1);
}
  
}
