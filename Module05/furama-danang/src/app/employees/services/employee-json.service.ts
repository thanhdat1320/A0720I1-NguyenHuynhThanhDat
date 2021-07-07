import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeJsonService {
  private API_URL = ' http://localhost:3000';

  constructor(httpClient: HttpClient) {
  }

  // @ts-ignore
  getAll(): Observable<any> {
  }

  // @ts-ignore
  getById(id: number): Observable<any> {
  }
}
