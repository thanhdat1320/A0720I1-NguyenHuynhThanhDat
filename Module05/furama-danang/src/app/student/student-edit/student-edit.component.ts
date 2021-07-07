import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {CustomerJsonService} from '../../customers/services/customer-json.service';
import {ActivatedRoute, Router} from '@angular/router';
import {StudentService} from '../services/student.service';

@Component({
  selector: 'app-student-edit',
  templateUrl: './student-edit.component.html',
  styleUrls: ['./student-edit.component.scss']
})
export class StudentEditComponent implements OnInit {
  idStudent = 0;
  formStudent: FormGroup;
  validationMessages = {
    'name': [
      {type: 'required', message: 'Name khong duoc de trong'},
      {type: 'pattern', message: 'Name khong dung dinh dang'}

    ],
    'batch': [
      {type: 'required', message: 'Batch khong duoc de trong'},
    ],
    'subject': [
      {type: 'required', message: 'Subject khong duoc de trong'},
    ],
    'teacher': [
      {type: 'required', message: 'Teacher khong duoc de trong'},
    ],
    'phone': [
      {type: 'required', message: 'Phone khong duoc de trong'},
      {type: 'pattern', message: 'Phone khong dung dinh dang'}
    ],
    'email': [
      {type: 'required', message: 'Email khong duoc de trong'},
      {type: 'email', message: 'Email khong dung dinh dang'}
    ]
  };

  constructor(
    private studentService: StudentService,
    private activatedRoute: ActivatedRoute,
    private fb: FormBuilder,
    private router: Router
  ) {
  }

  ngOnInit(): void {
    this.idStudent = this.activatedRoute.snapshot.params['id'];
    this.innitFormEdit();
    this.studentService.getStudentById(this.idStudent).subscribe(data => {
      this.formStudent.patchValue(data);
    });
  }

  innitFormEdit() {
    this.formStudent = this.fb.group({
      id: [''],
      name: ['', Validators.compose([Validators.required, Validators.pattern(/^[A-Z][a-z]+\\s+(\\s[A-Z][a-z]+)*$/)])],
      batch: ['', Validators.compose([Validators.required])],
      subject: ['', Validators.compose([Validators.required])],
      teacher: ['', Validators.compose([Validators.required])],
      phone: ['', Validators.compose([Validators.required, Validators.pattern(/(84|0[3|5|7|8|9])+([0-9]{8})/)])],
      email: ['', Validators.compose([Validators.required, Validators.email])]
    });
  }

  editStudent() {
    this.studentService.updateStudent(this.formStudent.value).subscribe(() => {
      this.router.navigateByUrl('/student');
    });
  }
}
