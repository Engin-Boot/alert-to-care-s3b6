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
  public admitThePatientICU(id){
    return this.http.get("http://localhost:8082/admitTo/ICU/"+id);
  }
  public admitThePatientLshape(id){
    return this.http.get("http://localhost:8082/admitTo/Lshape/"+id);
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
  public setupICU(n){
    return this.http.get("http://localhost:8082/ICU/"+n);
  }
  public setupLshape(n){
    return this.http.get("http://localhost:8082/Lshape/"+n);
  }
}
