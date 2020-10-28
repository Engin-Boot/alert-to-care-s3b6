import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PatientRegistrationComponent } from './patient-registration/patient-registration.component';
import { RegisterpatientService } from './registerpatient.service';
import { ViewPatientsComponent } from './view-patients/view-patients.component';
// import { ViewAndDeletePatientComponent } from './view-and-delete-patient/view-and-delete-patient.component';

const routes: Routes = [
  {path:"",redirectTo:"register",pathMatch:"full"},
  {path:"register",component:PatientRegistrationComponent},
  {path:"patients",component:ViewPatientsComponent}
  // {path:"search",component:ViewAndDeletePatientComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
