import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root',
})
export class ProductOrderService {
  serviceUrl = `${environment.protocol}${environment.applicationUrl}/${environment.productOrderService}`;

  constructor(private http: HttpClient) {}

  fetchAllProductOrders() {
    return this.http.get(`${this.serviceUrl}/productOrder`);
  }

  createProductOrderRequest(productOrder) {
    return this.http.post(`${this.serviceUrl}/productOrder`, productOrder);
  }

  updateStatus(formData) {
    return this.http.put(`${this.serviceUrl}/productOrder`, formData);
  }
}
