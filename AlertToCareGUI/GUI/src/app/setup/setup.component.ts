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
        if(shape=="Lshape"){

<<<<<<< HEAD
        let resp=this.patientService.setupLshape(n);
        resp.subscribe((data)=>this.message=data);
      }
      else if(shape="ICU"){
        let resp=this.patientService.setupICU(n);
          resp.subscribe((data)=>this.message=data);
      }
=======
            let resp=this.patientService.setupLshape(n);
            resp.subscribe((data)=>this.message=data);
        }
        else if(shape="ICU"){
            let resp=this.patientService.setupICU(n);
            resp.subscribe((data)=>this.message=data);
        }
>>>>>>> 14cc35b2ec503835902c543ca99e9016f4a5def3
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
