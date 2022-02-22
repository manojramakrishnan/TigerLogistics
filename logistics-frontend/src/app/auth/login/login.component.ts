import { Component, OnInit, OnDestroy } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Subscription } from 'rxjs';
import { AuthService } from 'src/app/services/auth.service';
import { LoadingService } from 'src/app/services/loading.service';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit, OnDestroy {
  loginForm: FormGroup;
  submitted = false;
  loginSubscription: Subscription;
  constructor(
    private authService: AuthService,
    private router: Router;
    private loadingService: LoadingService;
  ) { }

  ngOnInit(): void {
    this.authService.redirectIfLoggedIn();
    this.initForm();
  }
  ngOnDestroy(): void {
    if (this.loginSubscription) this.loginSubscription.unsubscribe();
  }
login(){
  this.submitted = true;
  if (this.loginForm.valid) this.submitData(this.loginForm.value);
}
submitData(formaData: any){
  this.loadingService.enableLoading();
  this.loginSubscription = this.authService.login(formData).subscribe(
    (response) => {
      this.router.navigate(['/dashboard']);
      this.loadingService.disableLoading();
    },
    (error) => {
      this.loadingService.disableLoading();
      if (error.error.message === 'FieldException')
          error.error.errors.forEach((element) =>
            this.loginForm.controls[element.field]?.setErrors({
              serverValidationError: element.message,
            })
          );
        else throw new Error(error);
      }
    );
    }
  initForm(){
    this.loginForm = new FormGroup({
      username: new FormControl('', [Validators.required]),
      password: new FormControl('', [Validators.required]),

    });
  }
}
