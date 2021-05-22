import {Component, OnInit} from '@angular/core';
import {listStudent} from '../studentList';
import {StudentService} from '../student.service';

@Component({
  selector: 'app-list-student',
  templateUrl: './list-student.component.html',
  styleUrls: ['./list-student.component.css']
})
export class ListStudentComponent implements OnInit {
  listStudent: IStudent[];
  // studentBase: IStudent;

  constructor(private studentService: StudentService) {
    this.listStudent = this.studentService.getAllStudent();
  }

  ngOnInit(): void {
  }

  // getInfo(student: IStudent) {
  //   this.studentBase = student;
  // }

  // changeClassHandler(student) {
  //   for (const stu of this.listStudent) {
  //     if (stu.id === student.id) {
  //       student = stu;
  //     }
  //   }
  // }

  deleteStudent(id: number) {
    this.studentService.deleteStudent(id);
    this.listStudent = this.studentService.getAllStudent();
  }
}
