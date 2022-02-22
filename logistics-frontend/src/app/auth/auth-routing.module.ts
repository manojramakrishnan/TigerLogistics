import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AuthComponent } from './auth.component';
import { ChangePassowrdComponent } from './change-password/ChangePassword.Component';
import { LoginComponent } from './login/login.component';
import {RequestQuestionComponent } from './request-question/RequestQuestion.Component';

const routes: Routes = [
  {
    path: 'login',
    component: 'AuthComponent',
    children: [
      { path: '', component: LoginComponent },
      { path: 'changepassword', component: ChangePasswordComponent },
      { path: 'forgetpassword', component: RequestQuestionComponent },
      { path: '**', redirectTo = '/404' },

    ]
  }
];

@NgModule({
  imports: [RouterModule.forchild(routes)],
  exports: [RouterModule],
})

export class AuthRoutingModule {}
