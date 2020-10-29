import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PatientRegistrationComponent } from './patient-registration/patient-registration.component';
import { RegisterpatientService } from './registerpatient.service';
import {HttpClientModule} from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { ViewPatientsComponent } from './view-patients/view-patients.component';
import { NurseLoginComponent } from './nurse-login/nurse-login.component';

import { ViewBedComponent } from './view-bed/view-bed.component';
import { SetupComponent } from './setup/setup.component';


@NgModule({
  declarations: [
    AppComponent,
    PatientRegistrationComponent,
    ViewPatientsComponent,
    NurseLoginComponent,
   
    ViewBedComponent,
   
    SetupComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
  ],
  providers: [RegisterpatientService],
  bootstrap: [AppComponent]
})
export class AppModule { }
