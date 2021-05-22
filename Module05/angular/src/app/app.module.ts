import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { PetComponent } from './pet/pet.component';
import { FontSizeComponent } from './font-size/font-size.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { ColorComponent } from './color-picker/color.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { HackernewsComponent } from './hackernews/hackernews.component';
import { LikeComponent } from './like/like.component';
import { ListStudentComponent } from './student/student-list/list-student.component';
import {StudentDetailComponent} from './student/student-detail/student-detail.component';
import { NameCardComponent } from './name-card/name-card.component';
import { StudentFormComponent } from './student/student-form/student-form.component';
import { StudentFormReactiveComponent } from './student/student-form-reactive/student-form-reactive.component';
import {AppRoutingModule} from './app-routing-module';
import { LoginComponent } from './login-user/login/login.component';
import { UserComponent } from './login-user/user/user.component';

@NgModule({
    declarations: [
        AppComponent,
        PetComponent,
        FontSizeComponent,
        ColorComponent,
        CalculatorComponent,
        HackernewsComponent,
        LikeComponent,
        ListStudentComponent,
        StudentDetailComponent,
        NameCardComponent,
        StudentFormComponent,
        StudentFormReactiveComponent,
        LoginComponent,
        UserComponent
    ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
