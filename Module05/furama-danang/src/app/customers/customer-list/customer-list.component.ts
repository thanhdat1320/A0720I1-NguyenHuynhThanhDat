import {Component, OnInit} from '@angular/core';
import {CustomerService} from '../services/customer.service';
import {MatDialog} from '@angular/material/dialog';
import {CustomerViewComponent} from '../customer-view/customer-view.component';
import {CustomerJsonService} from '../services/customer-json.service';
import {ConfirmDeleteComponent} from '../confirm-delete/confirm-delete.component';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.scss']
})
export class CustomerListComponent implements OnInit {
  // @ts-ignore
  listCustomer: ICustomer[] = [];
  // @ts-ignore
  customer: ICustomer;
  word: string;
  page: number;

  constructor(
    private customerService: CustomerService,
    private customerJsonService: CustomerJsonService,
    public dialog: MatDialog
  ) {
  }

  ngOnInit(): void {
    this.innitListCustomer();
  }

  innitListCustomer() {
    this.customerJsonService.getAllCustomer().subscribe(data => {
      this.listCustomer = data;
    });
  }

  modalView(id: number) {
    // @ts-ignore
    this.customerJsonService.getCustomerById(id).subscribe((data: ICustomer) => {
      this.customer = data;
      this.dialog.open(CustomerViewComponent, {
        width: '700px',
        data: {customer: this.customer}
      });
    });
  }

  searchCustomer() {
    this.customerJsonService.searchFullCustomer(this.word).subscribe(data => {
      if (data === '') {
        this.ngOnInit();
      } else {
        this.listCustomer = data;
      }
    });
  }

  deleteCustomer(id: number) {
    if (confirm('Are you sure to delete?')) {
      this.customerJsonService.deleteCustomer(id).subscribe(data => {
        this.innitListCustomer();
      });
    }
  }

  modalDelete(id: number) {
    this.customerJsonService.getCustomerById(id).subscribe((data) => {
      this.customer = data;
      const dialogRef = this.dialog.open(ConfirmDeleteComponent, {
        width: '300px',
        data: {customer: this.customer}
      });
      dialogRef.afterClosed().subscribe(result => {
        if (result) {
          this.customerJsonService.deleteCustomer(id).subscribe(() => {
            this.ngOnInit();
          });
        }
      });
    });
  }
}
