import {Component, Inject, OnInit} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {CustomerService} from '../services/customer.service';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';

class DialogData {
}

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
    // private activatedRoute: ActivatedRoute,
    // private customerService: CustomerService,
    public dialogRef: MatDialogRef<CustomerViewComponent>,
    @Inject(MAT_DIALOG_DATA) public data: DialogData
  ) {}

  ngOnInit(): void {
    // this.idCustomer = this.activatedRoute.snapshot.params['id'];
    this.customer = this.data.customer;
  }

  onNoClick() {
    this.dialogRef.close();
  }
}
