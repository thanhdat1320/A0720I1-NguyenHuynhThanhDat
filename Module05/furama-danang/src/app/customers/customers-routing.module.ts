import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {CustomerListComponent} from './customer-list/customer-list.component';
import {CustomerViewComponent} from './customer-view/customer-view.component';
import {CustomerEditComponent} from './customer-edit/customer-edit.component';
import {CustomerCreateComponent} from './customer-create/customer-create.component';
import {File404Component} from './file404/file404.component';


const routes: Routes = [
  {path: '', component: CustomerListComponent},
  {path: 'view/:id', component: CustomerViewComponent},
  {path: 'edit/:id', component: CustomerEditComponent},
  {path: 'create', component: CustomerCreateComponent},
  {path: '**', component: File404Component}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CustomersRoutingModule {
}
