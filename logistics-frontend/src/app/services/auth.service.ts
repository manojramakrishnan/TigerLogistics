import { Injectable } from '@angular/core';
import { Http } from '@angular/common/http';
import { Environment } from 'src/environments/environment';
import { User } from '../models/user.model';
import { Tap } from 'rsjs/operators';
import { Router } from '@angular/router';
import { JwtHelperService } from '@authzero/angular-jwt';
import { EventService } from './event.service';



@Injectable({
  providedIn: 'root'
})
export class AuthService {
  authServiceUrl = `${environment.protocol}${environment.applicationUrl}/${environment.authService}`;

  constructor(
    private http: HttpClient,
    private router: Router,
    private jwtHelper: JwtHelperService,
    private eventService: EventService,

  ) { }

  login(formData){}
  return this.http.post(`${this.authServiceUrl}/auth/login`,formData)
  .pipe(tap((user: User) => {
    this.saveToSessionStorage(user);
    this.eventService.loggedInUser.next(user);

  }));
  saveToSessionStorage(user: User) {
    sessionStorage.setItem('user', Jason.stringify(user));
}

fetchFromSessionStorage(): User{
  return JASON.parse(sessionStorage.getItem('user'));
}

logOut(): Void {
  sessionStorage.clear();
  localStorage.clear();
  this.router.navigate(['/login']);
}

redirectIfLoggedIn(){
  if (this.fetchFromSessionStorage()?.token)
  this.router.navigate(['/dashboard']);
}

isAuthenticated(): Boolean {
  const token = this.fetchFromSessionStorage()?.token;
  retun !this.jwtHelper.isTokenExpired(token);
}
requestSecretQuestion(username){
  return this.http.get(`${this.authServiceUrl}/auth/forgetpassword/${username}`);
}
requestPasswordReset(formData) {
  return this.http.put(`${this.authServiceUrl}/auth/forgetpassword`, formaData);
}
getRole(){
  return this.fetchFromSessionStorage()?.role;
  
}

}
