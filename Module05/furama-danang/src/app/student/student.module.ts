import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {StudentRoutingModule} from './student-routing.module';
import {StudentListComponent} from './student-list/student-list.component';
import {StudentEditComponent} from './student-edit/student-edit.component';
import {StudentCreateComponent} from './student-create/student-create.component';
import {ReactiveFormsModule} from '@angular/forms';
import {StudentViewComponent} from './student-view/student-view.component';


@NgModule({
  declarations: [
    StudentListComponent,
    StudentEditComponent,
    StudentCreateComponent,
    StudentViewComponent
  ],
  imports: [
    CommonModule,
    StudentRoutingModule,
    ReactiveFormsModule
  ]
})
export class StudentModule {
}
