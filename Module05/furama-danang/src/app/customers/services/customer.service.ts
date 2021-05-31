import {Injectable} from '@angular/core';

@Injectable({
  providedIn: 'root'
})

export class CustomerService {
  // @ts-ignore
  private listCustomer: ICustomer[] = [
    {
      id: 1,
      name: 'dat@gmail',
      birthday: '2000/03/01',
      gender: 'male',
      identify: 212893887,
      phone: '0919698287',
      email: 'dat@gmail',
      address: 'Dn',
      typeCustomer: 'Gold'
    },
    {
      id: 2,
      name: 'don@gmail',
      birthday: '2000/03/01',
      gender: 'male',
      identify: 212893887,
      phone: '0919698287',
      email: 'dat@gmail',
      address: 'Dn',
      typeCustomer: 'Gold'
    },
    {
      id: 3,
      name: 'dat@gmail',
      birthday: '2000/03/01',
      gender: 'male',
      identify: 212893887,
      phone: '0919698287',
      email: 'dat@gmail',
      address: 'Dn',
      typeCustomer: 'Gold'
    },
    {
      id: 4,
      name: 'dat@gmail',
      birthday: '2000/03/01',
      gender: 'male',
      identify: 212893887,
      phone: '0919698287',
      email: 'dat@gmail',
      address: 'Dn',
      typeCustomer: 'Gold'
    },
    {
      id: 5,
      name: 'dat@gmail',
      birthday: '2000/03/01',
      gender: 'male',
      identify: 212893887,
      phone: '0919698287',
      email: 'dat@gmail',
      address: 'Dn',
      typeCustomer: 'Gold'
    },
    {
      id: 6,
      name: 'dat@gmail',
      birthday: '2000/03/01',
      gender: 'male',
      identify: 212893887,
      phone: '0919698287',
      email: 'dat@gmail',
      address: 'Dn',
      typeCustomer: 'Gold'
    },
    {
      id: 7,
      name: 'dat@gmail',
      birthday: '2000/03/01',
      gender: 'male',
      identify: 212893887,
      phone: '0919698287',
      email: 'dat@gmail',
      address: 'Dn',
      typeCustomer: 'Gold'
    },
  ];

  constructor() {
  }

  getAllCustomer() {
    return this.listCustomer;
  }

  getCustomerById(id: number) {
    return this.listCustomer[id - 1];
  }

  // @ts-ignore
  createCustomer(customer: ICustomer) {
    if (this.listCustomer.length === 0) {
      customer.id = 1;
    } else {
      customer.id = this.listCustomer[this.listCustomer.length - 1].id + 1;
    }
    return this.listCustomer.push(customer);
  }

  // @ts-ignore
  editCustomer(customer: ICustomer, id: number) {
    for (let i = 0; i < this.listCustomer.length; i++) {
      if (this.listCustomer[i].id === id) {
        this.listCustomer[i] = customer;
      }
    }
  }
}
