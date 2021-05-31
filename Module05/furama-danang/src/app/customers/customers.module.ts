import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {CustomersRoutingModule} from './customers-routing.module';
import {CustomerListComponent} from './customer-list/customer-list.component';
import {CustomerViewComponent} from './customer-view/customer-view.component';
import {File404Component} from './file404/file404.component';
import {CustomerEditComponent} from './customer-edit/customer-edit.component';
import {CustomerCreateComponent} from './customer-create/customer-create.component';
import {MatFormFieldModule} from '@angular/material/form-field';
import {ReactiveFormsModule} from '@angular/forms';
import {MatInputModule} from '@angular/material/input';

@NgModule({
  declarations: [
    CustomerListComponent,
    CustomerViewComponent,
    File404Component,
    CustomerEditComponent,
    CustomerCreateComponent
  ],
  exports: [],
  imports: [
    CommonModule,
    CustomersRoutingModule,
    MatFormFieldModule,
    ReactiveFormsModule,
    MatInputModule
  ]
})
export class CustomersModule {
}
