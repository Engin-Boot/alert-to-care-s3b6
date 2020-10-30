import { Component, OnInit } from '@angular/core';
// import { Router } from '@angular/router';
// import { Observable } from 'rxjs';
import { Patient } from '../patient';
import { RegisterpatientService } from '../registerpatient.service';


@Component({
  selector: 'app-view-patients',
  templateUrl: './view-patients.component.html',
  styleUrls: ['./view-patients.component.css']
})
export class ViewPatientsComponent implements OnInit {
 patients:any;
 msg:any;

  constructor(private patientService:RegisterpatientService) { }

  public admitICU(id:number){
    let resp=this.patientService.admitThePatientICU(id);
    resp.subscribe((data)=>this.patients=data);
    resp.subscribe((data)=>this.msg=data);
  }
  public admitLshape(id:number){
    let resp=this.patientService.admitThePatientLshape(id);
    resp.subscribe((data)=>this.patients=data);
  }
  public discharge(id:number){
    let resp=this.patientService.dischargePatient(id);
    resp.subscribe((data)=>this.patients=data);
  }
  public delete(id:number){
    let resp=this.patientService.deletePatient(id);
    resp.subscribe((data)=>this.patients=data);
  }

  ngOnInit() {
    let resp=this.patientService.getPatientsList();
    resp.subscribe((data)=>this.patients=data);
  }
 

  

}
