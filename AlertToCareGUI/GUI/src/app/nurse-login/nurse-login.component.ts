import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-nurse-login',
  templateUrl: './nurse-login.component.html',
  styleUrls: ['./nurse-login.component.css']
})
export class NurseLoginComponent implements OnInit {
  username:string;
  password:string;
  constructor() { }

  ngOnInit(){
  }
  LoginUser(){
    if(this.username=="Admin" && this.password=="hospital"){
      console.log("Welcome To Philips Hospital");
    }
  }

}
