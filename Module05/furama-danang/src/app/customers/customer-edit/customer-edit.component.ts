import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {CustomerService} from '../services/customer.service';

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.scss']
})
export class CustomerEditComponent implements OnInit {
  idCustomer: number;

  constructor(
    private activatedRoute: ActivatedRoute,
    private customerService: CustomerService
  ) {
  }

  ngOnInit(): void {
    this.idCustomer = this.activatedRoute.snapshot.params['id'];
  }

}
