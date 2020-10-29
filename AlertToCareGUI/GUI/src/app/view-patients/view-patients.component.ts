import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Patient } from '../patient';
import { RegisterpatientService } from '../registerpatient.service';


@Component({
  selector: 'app-view-patients',
  templateUrl: './view-patients.component.html',
  styleUrls: ['./view-patients.component.css']
})
export class ViewPatientsComponent implements OnInit {
  patients:Observable<Patient[]>; 

  constructor(private patientService:RegisterpatientService,
    private router:Router) { }

  ngOnInit() {
    this.reloadData();
  }
  reloadData(){
    let resp = this.patientService.getPatientsList();
  }

  

}
