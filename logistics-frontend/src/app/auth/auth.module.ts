import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { SharedModule } from '../shared/shared.module';
import { AuthRoutingModule } from './auth-routing.module';
import { ChangePasswordComponent } from './change-password/change-password.component';
import { LoginComponent } from './login/login.component';
import { AuthComponent } from "./auth.component";
import { RequestQuestionComponent } from './request-question/request-question.component';
import { RequestSessionComponent } from './request-session/request-session.component';
import { AddDistributorComponent } from './add-distributor/add-distributor.component';



@NgModule({
  declarations: [
    LoginComponent,
    ChangePasswordComponent,
    AuthComponent,
    RequestQuestionComponent,
    RequestSessionComponent,
    AddDistributorComponent
  ],


imports: [
  CommonModule,
  SharedModule,
  FormsModule,
  ReactiveFormsModule,
  AuthRoutingModule,
  ],
}
)

export class AuthModule { }
