import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentFormReactiveComponent } from './student-form-reactive.component';

describe('StudentFormReactiveComponent', () => {
  let component: StudentFormReactiveComponent;
  let fixture: ComponentFixture<StudentFormReactiveComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StudentFormReactiveComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentFormReactiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
