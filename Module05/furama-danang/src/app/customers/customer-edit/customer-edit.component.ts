import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {AbstractControl, FormBuilder, FormGroup, Validators} from '@angular/forms';
import {CustomerJsonService} from '../services/customer-json.service';

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.scss']
})
export class CustomerEditComponent implements OnInit {
  idCustomer = 0;
  // @ts-ignore
  customer: ICustomer;
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
    private customerJsonService: CustomerJsonService,
    private activatedRoute: ActivatedRoute,
    private fb: FormBuilder,
    private router: Router
  ) {
  }

  ngOnInit(): void {
    this.idCustomer = this.activatedRoute.snapshot.params['id'];
    this.innitFormEdit();
    this.customerJsonService.getCustomerById(this.idCustomer).subscribe(data => {
      this.formCustomer.patchValue(data);
    });
  }

  innitFormEdit() {
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

  editCustomer() {
    this.customerJsonService.editCustomer(this.formCustomer.value, this.idCustomer).subscribe(() => {
      this.router.navigateByUrl('');
    });
  }
}

function validateAge(form: AbstractControl) {
  if ((new Date().valueOf() - new Date(form.value).valueOf()) / (365 * 24 * 3600 * 1000) < 18) {
    return {age18: true};
  }
  return null;
}
