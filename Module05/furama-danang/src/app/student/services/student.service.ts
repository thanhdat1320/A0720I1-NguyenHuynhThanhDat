import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {environment} from '../../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  private API_URL = environment.apiBaseUrl;

  constructor(private httpClient: HttpClient) {
  }

  // @ts-ignore
  getAllStudent(): Observable<IStudent[]> {
    // @ts-ignore
    return this.httpClient.get<IStudent[]>(this.API_URL + '/students');
  }

  // @ts-ignore
  addStudent(student: IStudent): Observable<IStudent> {
    return this.httpClient.post(this.API_URL + '/students/add', student);
  }

  // @ts-ignore
  updateStudent(student: IStudent): Observable<IStudent> {
    return this.httpClient.put(this.API_URL + '/students/update', student);
  }

  deleteStudent(id: number): Observable<void> {
    return this.httpClient.delete<void>(this.API_URL + '/students/delete/' + id);
  }

  // @ts-ignore
  getStudentById(id: number): Observable<IStudent> {
    // @ts-ignore
    return this.httpClient.get<IStudent>(this.API_URL + '/students/find/' + id);
  }

}
