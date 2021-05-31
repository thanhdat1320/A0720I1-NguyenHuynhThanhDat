import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {PetComponent} from './_02_angular-overview/practise/pet/pet.component';
import {FontSizeComponent} from './_02_angular-overview/practise/font-size/font-size.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {ColorComponent} from './_02_angular-overview/exercise/color-picker/color.component';
import {CalculatorComponent} from './_02_angular-overview/exercise/calculator/calculator.component';
import {HackernewsComponent} from './_03_angular-conponent-template/practise/hackernews/hackernews.component';
import {LikeComponent} from './_04_components-interaction/exercise/like/like.component';
import {ListStudentComponent} from './_05_angular-form/exercise/student/student-list/list-student.component';
import {StudentDetailComponent} from './_05_angular-form/exercise/student/student-detail/student-detail.component';
import {NameCardComponent} from './_04_components-interaction/practise/name-card/name-card.component';
import {StudentFormComponent} from './_05_angular-form/exercise/student/student-form/student-form.component';
import {StudentFormReactiveComponent} from './_05_angular-form/exercise/student/student-form-reactive/student-form-reactive.component';
import {AppRoutingModule} from './app-routing-module';
import {LoginComponent} from './_05_angular-form/exercise/login-user/login/login.component';
import {UserListComponent} from './_05_angular-form/exercise/user/user-list/user-list.component';
import {UserCreateComponent} from './_05_angular-form/exercise/user/user-create/user-create.component';
import {EditUserComponent} from './_05_angular-form/exercise/user/edit-user/edit-user.component';
import {UserSearchComponent} from './_05_angular-form/exercise/user/user-search/user-search.component';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {AppComponent} from './app.component';
import { ProgressBarComponent } from './_04_components-interaction/practise/progress-bar/progress-bar.component';
import { CountdownComponent } from './_04_components-interaction/exercise/countdown/countdown.component';
import { CountdownTimerAliasComponent } from './_04_components-interaction/exercise/countdown-timer-alias/countdown-timer-alias.component';

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
    UserListComponent,
    UserCreateComponent,
    EditUserComponent,
    UserSearchComponent,
    ProgressBarComponent,
    CountdownComponent,
    CountdownTimerAliasComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    AppRoutingModule,
    Ng2SearchPipeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
