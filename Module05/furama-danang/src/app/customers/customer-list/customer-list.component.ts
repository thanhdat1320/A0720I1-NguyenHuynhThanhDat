import {Component, OnInit} from '@angular/core';
import {CustomerService} from '../services/customer.service';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.scss']
})
export class CustomerListComponent implements OnInit {
  // @ts-ignore
  listCustomer: ICustomer[] = [];
  // displayedColumns: string[] = ['id', 'name', 'birthday', 'gender', 'identify', 'phone', 'email', 'address', 'typeCustomer'];
  constructor(private customerService: CustomerService) {
  }

  ngOnInit(): void {
    this.innitListCustomer();
  }

  innitListCustomer() {
    this.listCustomer = this.customerService.getAllCustomer();
  }
}
