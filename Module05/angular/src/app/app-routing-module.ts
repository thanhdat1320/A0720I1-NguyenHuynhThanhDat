import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {ListStudentComponent} from './_05_angular-form/exercise/student/student-list/list-student.component';
import {StudentFormReactiveComponent} from './_05_angular-form/exercise/student/student-form-reactive/student-form-reactive.component';
import {StudentDetailComponent} from './_05_angular-form/exercise/student/student-detail/student-detail.component';
import {LoginComponent} from './_05_angular-form/exercise/login-user/login/login.component';
import { UserListComponent } from './_05_angular-form/exercise/user/user-list/user-list.component';
import {UserCreateComponent} from './_05_angular-form/exercise/user/user-create/user-create.component';
import { EditUserComponent } from './_05_angular-form/exercise/user/edit-user/edit-user.component';
import {UserSearchComponent} from './_05_angular-form/exercise/user/user-search/user-search.component';

const routes: Routes = [
  {path: '', component: ListStudentComponent},
  {path: 'create', component: StudentFormReactiveComponent},
  {path: 'detail/:id', component: StudentDetailComponent},
  {path: 'login', component: LoginComponent},
  {path: 'user', component: UserListComponent},
  {path: 'createUser', component: UserCreateComponent},
  {path: 'editUser/:id', component: EditUserComponent},
  {path: 'search/:keyword', component: UserSearchComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule {
}
