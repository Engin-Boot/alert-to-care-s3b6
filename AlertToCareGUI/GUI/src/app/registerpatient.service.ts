import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RegisterpatientService {

  constructor(private http:HttpClient) { }

  public doRegisterPatient(patient){
    return this.http.post("http://localhost:9191/addPatient",patient,{responseType:'text' as 'json'});
  }
}
