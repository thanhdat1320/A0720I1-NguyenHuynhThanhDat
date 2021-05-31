import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup} from '@angular/forms';
import {CustomerService} from '../services/customer.service';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.scss']
})
export class CustomerCreateComponent implements OnInit {
  formCustomer: FormGroup;

  constructor(
    private fb: FormBuilder,
    private customerService: CustomerService
  ) {
  }

  innitFormCreate() {
    this.formCustomer = this.fb.group({
      name: [''],
      birthday: [''],
      gender: [''],
      identify: [''],
      phone: [''],
      email: [''],
      address: [''],
      typeCustomer: ['']
    });
  }

  ngOnInit(): void {
    this.innitFormCreate();
  }

}
