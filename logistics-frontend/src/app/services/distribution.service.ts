import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class DistributionService {
  serviceUrl =
    environment.protocol +
    environment.applicationUrl +
    '/' +
    environment.SupplierService;

  constructor(private http: HttpClient) {}

  fetchAllDistributors() {
    return this.http.get(this.serviceUrl + '/distributor');

  }

  addDistributor(formData) {
    return this.http.post(this.serviceUrl + '/distributor', formData);
  }

  updateDistributor(formData) {
    return this.http.put(this.serviceUrl + '/distributor', formData);

  }

  fetchById(id) {
    return this.http.get(this.serviceUrl + '/distributor' + id);

  }
}
