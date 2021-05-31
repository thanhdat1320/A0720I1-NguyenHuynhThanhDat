import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormBuilder, FormGroup, Validators} from '@angular/forms';
import {UserService} from '../user.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-user-create',
  templateUrl: './user-create.component.html',
  styleUrls: ['./user-create.component.css']
})
export class UserCreateComponent implements OnInit {

  formUser: FormGroup;
  // tslint:disable-next-line:variable-name
  validate_messages = {
    'email': [
      {type: 'required', message: 'Email khong duoc de trong'},
      {type: 'email', message: 'Email khong dung dinh dang'}
    ],
    'password': [
      {type: 'required', message: 'Password khong duoc de trong.'},
      {type: 'minlength', message: 'Password lon hon 6.'}
    ],
    'confirmPassword': [
      {type: 'matchPassword', message: 'Xac nhan lai mat khau'}
    ],
    'country': [
      {type: 'required', message: 'Country khong duoc de trong.'},
    ],
    'age': [
      {type: 'required', message: 'Age khong duoc de trong.'},
      {type: 'age18', message: 'Age phai tren 18 tuoi'},
    ],
    'phone': [
      {type: 'required', message: 'Phone khong duoc de trong.'},
      {type: 'pattern', message: 'Phone khong dung dinh dang'},
    ],
    'gender': [
      {type: 'pattern', message: 'Gender khong dung dinh dang.'}
    ]
  };

  constructor(private fb: FormBuilder, private userService: UserService, private router: Router) {
    this.formUser = fb.group({
      email: ['', Validators.compose([Validators.required, Validators.email])],
      pwGroup: this.fb.group({
        password: ['', Validators.compose([Validators.required, Validators.minLength(6)])],
        confirmPassword: ['', Validators.compose([Validators.required])]
      }, {validators: comparePassword}),
      country: ['', Validators.compose([Validators.required])],
      age: ['', Validators.compose([Validators.required, validateAge])],
      gender: ['', Validators.compose([Validators.required, Validators.pattern(/^Male|Female|Other$/)])],
      phone: ['', Validators.compose([Validators.required, Validators.pattern(/(84|0[3|5|7|8|9])+([0-9]{8})/)])]
    });
  }

  ngOnInit(): void {
  }

  createUser() {
    if (this.formUser.valid) {
      this.userService.createUser(this.formUser.value);
      this.router.navigateByUrl('user');
    }
  }
}

function comparePassword(form: AbstractControl) {
  const pw = form.value;
  if (pw.password !== pw.confirmPassword) {
    return {matchPassword: true};
  }
  return null;
}

function validateAge(form: AbstractControl) {
  if ((new Date().valueOf() - new Date(form.value).valueOf()) / (365 * 24 * 3600 * 1000) < 18) {
    return {age18: true};
  }
  return null;
}
