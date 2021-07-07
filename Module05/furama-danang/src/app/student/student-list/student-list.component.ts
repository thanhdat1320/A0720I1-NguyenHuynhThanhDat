import {Component, OnInit} from '@angular/core';
import {MatDialog} from '@angular/material/dialog';
import {StudentService} from '../services/student.service';
import {ConfirmDeleteComponent} from '../../customers/confirm-delete/confirm-delete.component';
import {HttpErrorResponse} from '@angular/common/http';
import {StudentViewComponent} from '../student-view/student-view.component';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.scss']
})
export class StudentListComponent implements OnInit {
  // @ts-ignore
  listStudent: IStudent[] = [];
  // @ts-ignore
  student: IStudent;

  constructor(
    public dialog: MatDialog,
    private studentService: StudentService
  ) {
  }

  ngOnInit(): void {
    this.innitListStudent();
  }

  innitListStudent() {
    // @ts-ignore
    this.studentService.getAllStudent().subscribe((response: IStudent[]) => {
        this.listStudent = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  deleteStudent(id: number) {
    this.studentService.getStudentById(id).subscribe((data) => {
      this.student = data;
      const dialogRef = this.dialog.open(ConfirmDeleteComponent, {
        width: '300px',
        data: {student: this.student}
      });
      dialogRef.afterClosed().subscribe(result => {
        if (result) {
          this.studentService.deleteStudent(id).subscribe(() => {
            this.ngOnInit();
          });
        }
      });
    });
  }

  viewStudent(id: number) {
    this.studentService.getStudentById(id).subscribe(data => {
      this.student = data;
      const dialogRef = this.dialog.open(StudentViewComponent, {
        width: '300px',
        data: {student: this.student}
      });
      dialogRef.afterClosed().subscribe(() => {
        this.ngOnInit();
      });
    });
  }
}
