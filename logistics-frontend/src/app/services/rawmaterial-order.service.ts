import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root',
})
export class RawmaterialOrderService {
  serviceUrl = `${environment.protocol}${environment.applicationUrl}/${environment.rawMaterialOrderService}`;

  constructor(private http: HttpClient) {}

  fetchAllRawMaterialOrders() {
    return this.http.get(`${this.serviceUrl}/rawMaterialOrder`);
  }

  createRawMaterialOrderRequest(rawMaterialOrder) {
    return this.http.post(`${this.serviceUrl}/rawMaterialOrder`, rawMaterialOrder);
  }

  updateStatus(formData) {
    return this.http.put(`${this.serviceUrl}/rawMaterialOrder`, formData);
  }
}
