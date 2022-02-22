/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-11-04 19:09:49
 * @modify date 2020-11-04 19:09:49
 * @desc Material Modules
 */

 import { NgModule } from '@angular/core';
 import { CommonModule } from '@angular/common';
 import { MatDailogModule } from '@angular/material/dialog';
 import { MatButtonModule } from '@angular/material/button';
 import { MatPaginatorModule } from '@angular/material/paginator';
 import { MatTableModule } from '@angular/material/table';
 import { MatSortModule } from '@angular/material/sort';
 import { MatFormFieldModule } from '@angular/material/form-field';
 import { MatInputModule } from '@angular/material/input';
 import { MatCardModule } from '@angular/material/card';
 import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
 import { MatSelectModule } from '@angular/material/select';
 import { MatIconModule } from '@angular/material/icon';


@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    MatDailogModule,
    MatButtonModule,
    MatTableModule,
    MatSortModule, // Required for sorting table
    MatPaginatorModule,
    MatCardModule,
    MatFormFieldModule,
    MatProgressSpinnerModule,
    MatInputModule,
    MatSelectModule,
    MatIconModule,
  ],
  exports: [
    MatDailogModule,
    MatButtonModule,
    MatTableModule,
    MatSortModule, // Required for sorting table
    MatPaginatorModule,
    MatCardModule,
    MatFormFieldModule,
    MatProgressSpinnerModule,
    MatInputModule,
    MatSelectModule,
    MatIconModule,

  ],
})

export class MaterialCustomModule {}
