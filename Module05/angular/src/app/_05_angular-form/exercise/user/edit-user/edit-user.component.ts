import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormBuilder, FormGroup, Validators} from '@angular/forms';
import {UserService} from '../user.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-edit-user',
  templateUrl: './edit-user.component.html',
  styleUrls: ['./edit-user.component.css']
})
export class EditUserComponent implements OnInit {
  formEdit: FormGroup;
  private id = 0;
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
      {type: 'required', message: 'Password khong duoc de trong.'},
      {type: 'minlength', message: 'Password lon hon 6.'},
      {type: 'matchPassword', message: 'Xac nhan lai mat khau'}
    ],
    'country': [
      {type: 'required', message: 'Country khong duoc de trong.'},
    ],
    'age': [
      {type: 'required', message: 'Age khong duoc de trong.'},
      {type: 'age18', message: 'Age phat ten 18 tuoi'},
    ],
    'phone': [
      {type: 'required', message: 'Phone khong duoc de trong.'},
      {type: 'pattern', message: 'Phone khong dung dinh dang'},
    ],
    'gender': [
      {type: 'pattern', message: 'Gender khong dung dinh dang.'}
    ]
  };

  constructor(private fb: FormBuilder, private userService: UserService, private activatedRoute: ActivatedRoute, private router: Router) {
  }

  ngOnInit(): void {
    this.id = this.activatedRoute.snapshot.params['id'];
    this.initFormEdit();
    this.formEdit.patchValue(this.userService.getUserById(this.id));
  }

  initFormEdit() {
    this.formEdit = this.fb.group({
      email: ['', Validators.compose([Validators.required, Validators.email])],
      pwGroup: this.fb.group({
        password: ['', Validators.compose([Validators.required, Validators.minLength(6)])],
        confirmPassword: ['', Validators.compose([Validators.required, Validators.minLength(6)])]
      }, {validators: comparePassword}),
      country: ['', Validators.compose([Validators.required])],
      age: ['', Validators.compose([Validators.required, validateAge])],
      gender: ['', Validators.compose([Validators.required, Validators.pattern(/^Male|Female|Other$/)])],
      phone: ['', Validators.compose([Validators.required, Validators.pattern(/(84|0[3|5|7|8|9])+([0-9]{8})/)])]
    });
  }

  editUser() {
    if (this.formEdit.valid) {
      this.formEdit.value.id = this.id;
      this.userService.editUser(this.formEdit.value, this.id);
      this.router.navigateByUrl('/user');
    }
  }
}

function comparePassword(form: AbstractControl) {
  // tslint:disable-next-line:triple-equals
  // return (form.value.password == form.value.passwordConfirm) ? null : {matchPass: true};
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
