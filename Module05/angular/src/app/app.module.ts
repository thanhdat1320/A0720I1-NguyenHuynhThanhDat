import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { PetComponent } from './pet/pet.component';
import { FontSizeComponent } from './font-size/font-size.component';
import {FormsModule} from '@angular/forms';
import { ColorComponent } from './color-picker/color.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { HackernewsComponent } from './hackernews/hackernews.component';
import { LikeComponent } from './like/like.component';
import { ListStudentComponent } from './student/student-list/list-student.component';
import {StudentDetailComponent} from './student/student-detail/student-detail.component';
import { NameCardComponent } from './name-card/name-card.component';

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
        NameCardComponent
    ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
