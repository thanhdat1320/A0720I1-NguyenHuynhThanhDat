import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';

class DialogData {
}

@Component({
  selector: 'app-customer-view',
  templateUrl: './customer-view.component.html',
  styleUrls: ['./customer-view.component.scss']
})
export class CustomerViewComponent implements OnInit {
  // @ts-ignore
  customer: ICustomer;

  constructor(
    // private activatedRoute: ActivatedRoute,
    // private customerService: CustomerService,
    public dialogRef: MatDialogRef<CustomerViewComponent>,
    @Inject(MAT_DIALOG_DATA) public data: DialogData
  ) {}

  ngOnInit(): void {
  }

  onNoClick() {
    this.dialogRef.close();
  }
}
