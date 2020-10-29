import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { pid } from 'process';

@Injectable({
  providedIn: 'root'
})
export class RegisterpatientService {

  constructor(private http:HttpClient) { }

  public doRegisterPatient(patient){
    return this.http.post("http://localhost:8082/addPatient",patient,{responseType:'text' as 'json'});
  }

  public getPatientsList(){
    return this.http.get("http://localhost:8082/viewAllPatients");
  }
  public admitThePatient(id){
    return this.http.get("http://localhost:8082/admit/"+id);
  }
  public dischargePatient(id){
    return this.http.get("http://localhost:8082/discharge/"+id);
  }
  public deletePatient(id){
    return this.http.delete("http://localhost:8082/deletePatient/"+id);
  }
  public viewAllBeds(){
    return this.http.get("http://localhost:8082/viewAllBed");
  }
  public alertTheStatus(bed){
    return this.http.post("http://localhost:8082/setAlert",bed,{responseType:'text' as 'json'});
  }
  public resetThestatus(bed){
    return this.http.post("http://localhost:8082/resetAlert",bed,{responseType:'text' as 'json'});
  }
}
