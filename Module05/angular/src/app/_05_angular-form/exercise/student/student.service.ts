import {Injectable} from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  // @ts-ignore
  private studentListService: IStudent[] = [
    {
      id: 1,
      name: 'dat',
      class: 'A07'
    },
    {
      id: 2,
      name: 'loong',
      class: 'A07'
    },
    {
      id: 3,
      name: 'phat',
      class: 'A07'
    },
    {
      id: 4,
      name: 'don',
      class: 'A07'
    },
  ];

  constructor() {
  }

  // @ts-ignore
  addStudent(student: IStudent): void {
    this.studentListService.push(student);
  }

  // @ts-ignore
  getAllStudent(): IStudent {
    return this.studentListService;
  }

  // @ts-ignore
  getStudentById(id: number): IStudent {
    for (let student of this.studentListService) {
      // tslint:disable-next-line:triple-equals
      if (id == student.id) {
        return student;
      }
    }
    return null;
  }

  deleteStudent(id: number): void {
    this.studentListService = this.studentListService.filter(student => student.id !== id);
  }
}
