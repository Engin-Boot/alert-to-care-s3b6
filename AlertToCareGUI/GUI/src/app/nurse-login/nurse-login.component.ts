import { Component, OnInit } from '@angular/core';
import { RegisterpatientService } from '../registerpatient.service';

@Component({
  selector: 'app-nurse-login',
  templateUrl: './nurse-login.component.html',
  styleUrls: ['./nurse-login.component.css']
})
export class NurseLoginComponent implements OnInit {
  
  beds:any;
  message:any;
  
  constructor(private patientService:RegisterpatientService) { }
  ngOnInit(){
    let resp = this.patientService.viewAllBeds();
    resp.subscribe((data)=>this.beds=data);
  }
  

}
