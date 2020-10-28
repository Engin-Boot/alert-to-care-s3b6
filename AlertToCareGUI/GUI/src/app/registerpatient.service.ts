import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RegisterpatientService {

  constructor(private http:HttpClient) { }

  public doRegisterPatient(patient){
    return this.http.post("http://localhost:8082/addPatient",patient,{responseType:'text' as 'json'});
  }

  public getPatientsList(){
    return this.http.get("http://localhost:8082/getAllUsers");
  }
}
