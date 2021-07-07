import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerJsonService {
  private API_URL = ' http://localhost:3000';

  constructor(private httpClient: HttpClient) {
  }

  // @ts-ignore
  getAllCustomer(): Observable<ICustomer[]> {
    // @ts-ignore
    return this.httpClient.get<ICustomer[]>(this.API_URL + '/customers');
  }

  // @ts-ignore
  getCustomerById(id: number): Observable<ICustomer> {
    // @ts-ignore
    return this.httpClient.get<ICustomer>(this.API_URL + '/customers/' + id);
  }

  // @ts-ignore
  createCustomer(customer: ICustomer): Observable<any> {
    return this.httpClient.post(this.API_URL + '/customers', customer);
  }

  // @ts-ignore
  editCustomer(customer: ICustomer, id: number) {
    return this.httpClient.put(this.API_URL + '/customers/' + id, customer);
  }

  searchByNameCustomer(word: string): Observable<any> {
    return this.httpClient.get(this.API_URL + '/customers?name=' + word);
  }

  searchFullCustomer(word: string): Observable<any> {
    return this.httpClient.get(this.API_URL + '/customers?q=' + word);
  }

  deleteCustomer(id: number): Observable<any> {
    return this.httpClient.delete(this.API_URL + '/customers/' + id);
  }
}
