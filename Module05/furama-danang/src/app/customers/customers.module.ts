import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {CustomersRoutingModule} from './customers-routing.module';
import {CustomerListComponent} from './customer-list/customer-list.component';
import {CustomerViewComponent} from './customer-view/customer-view.component';
import {File404Component} from './file404/file404.component';
import {CustomerEditComponent} from './customer-edit/customer-edit.component';
import {CustomerCreateComponent} from './customer-create/customer-create.component';
import {MatFormFieldModule} from '@angular/material/form-field';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatInputModule} from '@angular/material/input';
import {MatButtonModule} from '@angular/material/button';
import {MatDialogModule} from '@angular/material/dialog';
import {HttpClientModule} from '@angular/common/http';
import {NgxPaginationModule} from 'ngx-pagination';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import { ConfirmDeleteComponent } from './confirm-delete/confirm-delete.component';

@NgModule({
  declarations: [
    CustomerListComponent,
    CustomerViewComponent,
    File404Component,
    CustomerEditComponent,
    CustomerCreateComponent,
    ConfirmDeleteComponent,
  ],
  exports: [],
  imports: [
    CommonModule,
    CustomersRoutingModule,
    MatFormFieldModule,
    ReactiveFormsModule,
    MatInputModule,
    MatButtonModule,
    MatDialogModule,
    HttpClientModule,
    NgxPaginationModule,
    FormsModule,
    Ng2SearchPipeModule
  ]
})
export class CustomersModule {
}
