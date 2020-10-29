import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NurseLoginComponent } from './nurse-login/nurse-login.component';
import { PatientRegistrationComponent } from './patient-registration/patient-registration.component';
import { RegisterpatientService } from './registerpatient.service';
import { ViewBedComponent } from './view-bed/view-bed.component';
import { ViewPatientsComponent } from './view-patients/view-patients.component';
// import { ViewAndDeletePatientComponent } from './view-and-delete-patient/view-and-delete-patient.component';

const routes: Routes = [
 // {path:"",redirectTo:"register",pathMatch:"full"},
  {path:"register",component:PatientRegistrationComponent},
  {path:"patients",component:ViewPatientsComponent},
  {path:"login",component:NurseLoginComponent},
  {path:"beds",component:ViewBedComponent}
  // {path:"search",component:ViewAndDeletePatientComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
