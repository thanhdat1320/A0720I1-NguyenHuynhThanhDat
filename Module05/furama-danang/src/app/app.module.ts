import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {AppRoutingModule} from './app-routing.module';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {CustomersModule} from './customers/customers.module';
import {AppComponent} from './app.component';
import {MatProgressBarModule} from '@angular/material/progress-bar';
import {EmployeesModule} from './employees/employees.module';
import {HomePageComponent} from './home-page/home-page.component';
import {StudentModule} from './student/student.module';


@NgModule({
  declarations: [
   AppComponent,
   HomePageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatProgressBarModule,
    CustomersModule,
    EmployeesModule,
    StudentModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
