import {NgModule} from '@angular/core';
import {Routes, RouterModule, PreloadAllModules} from '@angular/router';
import {HomePageComponent} from './home-page/home-page.component';


const routes: Routes = [
  {path: '', component: HomePageComponent},
  {path: 'customers', loadChildren: () => import('./customers/customers.module').then(m => m.CustomersModule)},
  {path: 'employees', loadChildren: () => import('./employees/employees.module').then(m => m.EmployeesModule)}

];

@NgModule({
  imports: [RouterModule.forRoot(routes, {
    preloadingStrategy: PreloadAllModules
  })],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
