import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrls: ['./student-detail.component.css']
})
export class StudentDetailComponent implements OnInit {
  @Input()
  studentChild: IStudent;

  @Output()
  classChange: EventEmitter<IStudent> = new EventEmitter<IStudent>();

  constructor() {
  }

  ngOnInit(): void {
  }

  setClass(classs: IStudent) {
    this.studentChild.class = classs.value;
    this.classChange.emit(this.studentChild);
  }
}
