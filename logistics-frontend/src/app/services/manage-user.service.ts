import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root',
})
export class ManageUserService {
  authServiceUrl = `${environment.protocol}${environment.applicationUrl}/${environment.authService}`;

  constructor(private http : HttpClient) {}

  fetchAllUsers() {
    return this.http.get(`${this.authServiceUrl}/register`);
  }

  updateUser(fromData) {
    return this.http.put(`${this.authServiceUrl}/register`, fromData);
  }

  addUser(fromData) {
    return this.http.post(`${this.authServiceUrl}/register`, fromData);
  }

  fetchById(id) {
    return this.http.get(`${this.authServiceUrl}/register/${id}`);
  }
}
