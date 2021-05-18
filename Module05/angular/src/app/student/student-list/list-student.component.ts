import {Component, OnInit} from '@angular/core';
import {listStudent} from '../studentList';

@Component({
  selector: 'app-list-student',
  templateUrl: './list-student.component.html',
  styleUrls: ['./list-student.component.css']
})
export class ListStudentComponent implements OnInit {
  listStudent = listStudent;
  studentBase: IStudent;

  constructor() {
  }

  ngOnInit(): void {
  }

  showInfo(student: IStudent) {
    this.studentBase = student;
  }


  changeClassHandler(student) {
    for (const stu of this.listStudent) {
      if (stu.id === student.id) {
        student = stu;
      }
    }
  }
}
