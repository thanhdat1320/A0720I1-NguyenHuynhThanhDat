import { Component, OnInit } from '@angular/core';
import {NgForm} from '@angular/forms';

@Component({
  selector: 'app-student-form',
  templateUrl: './student-form.component.html',
  styleUrls: ['./student-form.component.css']
})
export class StudentFormComponent implements OnInit {
  // @ts-ignore
  student: IStudent;
  constructor() { }

  ngOnInit(): void {
  }

  onSubmit(form) {
    if (form.valid) {
      this.student = form.value;
      console.log(this.student);
    }
  }
}
