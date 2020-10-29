import { Component, OnInit } from '@angular/core';
import { RegisterpatientService } from '../registerpatient.service';
import { Shape } from '../shape';

@Component({
  selector: 'app-setup',
  templateUrl: './setup.component.html',
  styleUrls: ['./setup.component.css']
})
export class SetupComponent implements OnInit {
  shape:Shape=new Shape(1,"");
  message:any;  
  
  constructor(private patientService:RegisterpatientService) { }

  

  
  ngOnInit(): void {
  }
    public registerType(shape:string,n:number){
      console.log(shape);
       
      if(shape=="Lshape"){

        let resp=this.patientService.setupLshape(n);
        resp.subscribe((data)=>this.message=data);
      }
      if(shape="ICU"){
        let resp=this.patientService.setupICU(n);
          resp.subscribe((data)=>this.message=data);
      }
    }
  // public addICU(shape:string,n:number){  
  //   let resp=this.patientService.setupICU(shape,n);
  //   resp.subscribe((data)=>this.message=data);
  //   }
  //   public addlshaped(shape:string,n:number){
  //     let resp=this.patientService.setupLshape(shape,n);
  //   resp.subscribe((data)=>this.message=data);
  //   }
    

}
