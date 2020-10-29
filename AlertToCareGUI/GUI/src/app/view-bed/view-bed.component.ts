import { Component, OnInit } from '@angular/core';
import { Bed } from '../bed';
import { RegisterpatientService } from '../registerpatient.service';

@Component({
  selector: 'app-view-bed',
  templateUrl: './view-bed.component.html',
  styleUrls: ['./view-bed.component.css']
})
export class ViewBedComponent implements OnInit {
  beds:any;
  message:any;
  bd:Bed=new Bed(1,1,"","",1,1,1);
  constructor(private patientService:RegisterpatientService) { }

  public registerAlertOption(){
    console.log(this.bd);
  let resp=this.patientService.alertTheStatus(this.bd);
  resp.subscribe((data)=>this.message=data);
  }
  public registerResetoption(){
    console.log(this.bd);
    let resp=this.patientService.resetThestatus(this.bd);
    resp.subscribe((data)=>this.message=data);
  }
  ngOnInit(){
    let resp=this.patientService.viewAllBeds();
    resp.subscribe((data)=>this.beds=data);
  }

}
