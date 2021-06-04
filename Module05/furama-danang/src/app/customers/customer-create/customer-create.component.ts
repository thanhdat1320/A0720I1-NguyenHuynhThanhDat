import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import {CustomerService} from '../services/customer.service';
import {CustomerJsonService} from '../services/customer-json.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.scss']
})
export class CustomerCreateComponent implements OnInit {
  formCustomer: FormGroup;
  validationMessages = {
    'name': [
      {type: 'required', message: 'Name khong duoc de trong'}
    ],
    'birthday': [
      {type: 'required', message: 'Birthday khong duoc de trong'},
      {type: 'age18', message: 'Tuoi phai tren 18'}
    ],
    'gender': [
      {type: 'required', message: 'Email khong duoc de trong'}
    ],
    'identify': [
      {type: 'required', message: 'Email khong duoc de trong'}
    ],
    'phone': [
      {type: 'required', message: 'Email khong duoc de trong'}
    ],
    'email': [
      {type: 'required', message: 'Email khong duoc de trong'},
      {type: 'email', message: 'Email khong dung dinh dang'}
    ],
    'address': [
      {type: 'required', message: 'Email khong duoc de trong'}
    ],
    'typeCutomer': [
      {type: 'required', message: 'Email khong duoc de trong'}
    ]
  };

  constructor(
    private fb: FormBuilder,
    private customerService: CustomerService,
    private customerJsonService: CustomerJsonService,
    private router: Router
  ) {
  }

  ngOnInit(): void {
    this.innitFormCreate();
  }

  innitFormCreate() {
    this.formCustomer = this.fb.group({
      name: ['', Validators.compose([Validators.required])],
      birthday: ['', Validators.compose([
        Validators.required,
        validateAge
      ])],
      gender: ['', Validators.compose([Validators.required])],
      identify: ['', Validators.compose([Validators.required])],
      phone: ['', Validators.compose([Validators.required])],
      email: ['', Validators.compose([
        Validators.required,
        Validators.email
      ])],
      address: ['', Validators.compose([Validators.required])],
      typeCustomer: ['', Validators.compose([Validators.required])]
    });
  }

  createCustomer() {
    console.log(this.formCustomer);
    if (this.formCustomer.valid) {
      console.log(this.formCustomer);
      this.customerJsonService.createCustomer(this.formCustomer.value).subscribe(() => {
        this.router.navigateByUrl('/');
      });
    }
  }
}

function validateAge(form: AbstractControl) {
  if ((new Date().valueOf() - new Date(form.value).valueOf()) / (365 * 24 * 3600 * 1000) < 18) {
    return {age18: true};
  }
  return null;
}
