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
  bed:Bed;
  constructor(private patientService:RegisterpatientService) { }

  public registerAlertOption(id:number){
    let resp = this.patientService.alertTheStatus(id);
    resp.subscribe((data)=>this.message=data);
  }
  public registerResetoption(id:number){
    let resp = this.patientService.resetThestatus(id);
    resp.subscribe((data)=>this.message=data);
  }
  ngOnInit(){
    let resp = this.patientService.viewAllBeds();
    resp.subscribe((data)=>this.beds=data);
  }

}
