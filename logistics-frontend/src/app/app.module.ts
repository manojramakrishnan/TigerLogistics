import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NotFoundComponent } from './src/app/shared/not-found/not-found.component';
import { ErrorDisplayComponent } from './shared/error-display/error-display.component';
import { FooterComponent } from './shared/footer/footer.component';
import { NavigationComponent } from './shared/navigation/navigation.component';
import { UpdateStatusComponent } from './shared/update-status/update-status.component';
import { AuthComponent } from './src/app/auth/auth.component';
import { ChangePasswordComponent } from './auth/change-password/change-password.component';
import { LoginComponent } from './auth/login/login.component';
import { RequestQuestionComponent } from './auth/request-question/request-question.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AddProductOrderComponent } from './products/add-product-order/add-product-order.component';
import { AddProductComponent } from './products/add-product/add-product.component';
import { ViewProductOrdersComponent } from './products/view-product-orders/view-product-orders.component';
import { ViewProductsComponent } from './products/view-products/view-products.component';
import { EditProfileComponent } from './profile/edit-profile/edit-profile.component';
import { ViewProfileComponent } from './profile/view-profile/view-profile.component';
import { AddRawMaterialOrderComponent } from './raw-materials/add-raw-material-order/add-raw-material-order.component';
import { AddRawMaterialComponent } from './raw-materials/add-raw-material/add-raw-material.component';
import { ViewRawMaterialOrdersComponent } from './raw-materials/view-raw-material-orders/view-raw-material-orders.component';
import { ViewRawMaterialComponent } from './raw-materials/view-raw-material/view-raw-material.component';
import { AddSupplierComponent } from './supplier/add-supplier/add-supplier.component';
import { UpdateSupplierComponent } from './supplier/update-supplier/update-supplier.component';
import { ViewSupplierComponent } from './supplier/view-supplier/view-supplier.component';
import { AddUserComponent } from './users/add-user/add-user.component';
import { ViewUsersComponent } from './users/view-users/view-users.component';
import { AddDistributorComponent } from './distributor/add-distributor/add-distributor.component';
import { UpdateDistributorComponent } from './distributor/update-distributor/update-distributor.component';
import { ViewDistributorComponent } from './distributor/view-distributor/view-distributor.component';


@NgModule({
  declarations: [
    AppComponent,
    NotFoundComponent,
    ErrorDisplayComponent,
    FooterComponent,
    NavigationComponent,
    UpdateStatusComponent,
    AuthComponent,
    ChangePasswordComponent,
    LoginComponent,
    RequestQuestionComponent,
    DashboardComponent,
    AddProductOrderComponent,
    AddProductComponent,
    ViewProductOrdersComponent,
    ViewProductsComponent,
    EditProfileComponent,
    ViewProfileComponent,
    AddRawMaterialOrderComponent,
    AddRawMaterialComponent,
    ViewRawMaterialOrdersComponent,
    ViewRawMaterialComponent,
    AddSupplierComponent,
    UpdateSupplierComponent,
    ViewSupplierComponent,
    AddUserComponent,
    ViewUsersComponent,
    AddDistributorComponent,
    UpdateDistributorComponent,
    ViewDistributorComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    AppRoutingModule,
  ],


  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
