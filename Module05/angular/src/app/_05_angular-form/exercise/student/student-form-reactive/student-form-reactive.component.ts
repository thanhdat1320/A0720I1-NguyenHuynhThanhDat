import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import {StudentService} from '../student.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-student-form-reactive',
  templateUrl: './student-form-reactive.component.html',
  styleUrls: ['./student-form-reactive.component.css']
})
export class StudentFormReactiveComponent implements OnInit {
  // @ts-ignore
  student: IStudent;
  formReactive: FormGroup;
  // tslint:disable-next-line:variable-name
  validation_messages = {
    'id': [
      {type: 'required', message: 'id khong dc bo trong'}
    ],
    'name': [
      {type: 'required', message: 'name ko dc de trong'}
    ],
    'class': [
      {type: 'required', message: 'class khong duoc de trong'}
    ]
  };

  constructor(private fb: FormBuilder, private studentService: StudentService, private router: Router) {
    // Reactive Form
    this.formReactive = fb.group({
      id: ['', Validators.compose([
        Validators.required
      ])],
      name: ['', Validators.compose([
        Validators.required,
        Validators.maxLength(5),
        Validators.minLength(1)
      ])],
      class: ['', Validators.required]
    });
  }

  ngOnInit(): void {
    // Template Form
    // this.formReactive = new FormGroup({
    //   id: new FormControl('', Validators.compose([
    //     Validators.required
    //   ])),
    //   name: new FormControl('', Validators.compose([
    //     Validators.required,
    //     Validators.maxLength(5),
    //     Validators.minLength(1)
    //   ])),
    //   class: new FormControl('', Validators.required)
    // });
  }

  onSubmit() {
    if (this.formReactive.valid) {
      this.studentService.addStudent(this.formReactive.value);
      this.formReactive.reset();
      this.router.navigateByUrl('/');
    }
  }
}

// Validate Age < 18
function validateAge(form: AbstractControl) {
  if ((new Date().valueOf() - new Date(form.value).valueOf()) / (365 * 24 * 3600 * 1000) < 18) {
    return {age: true};
  }
  return null;
}
