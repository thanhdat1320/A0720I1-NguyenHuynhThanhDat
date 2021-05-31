import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {CustomerService} from '../services/customer.service';

@Component({
  selector: 'app-customer-view',
  templateUrl: './customer-view.component.html',
  styleUrls: ['./customer-view.component.scss']
})
export class CustomerViewComponent implements OnInit {
  idCustomer: number;
  // @ts-ignore
  customer: ICustomer;

  constructor(
    private activatedRoute: ActivatedRoute,
    private customerService: CustomerService,
  ) {
  }

  ngOnInit(): void {
    this.idCustomer = this.activatedRoute.snapshot.params['id'];
    this.customer = this.customerService.getCustomerById(this.idCustomer);
  }

}
