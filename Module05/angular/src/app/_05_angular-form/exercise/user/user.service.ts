import {Injectable} from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  // @ts-ignore
  private listUser: IUser[] = [
    {id: 1, email: 'dat@gmail', age: 21, country: 'VN', gender: 'male', phone: '0964646852', password: '123456'},
    {id: 2, email: 'long@gmail', age: 18, country: 'VN', gender: 'male', phone: '0964646852', password: '123456'},
    {id: 3, email: 'don@gmail', age: 23, country: 'VN', gender: 'male', phone: '0999999999', password: '123456'}
  ];

  constructor() {
  }

  // @ts-ignore
  getAllUser(): IUser[] {
    return this.listUser;
  }

  // @ts-ignore
  getUserById(id: number): IUser {
    return this.listUser[id - 1];
  }

  createUser(user: IUser) {
    if (this.listUser.length === 0) {
      user.id = 1;
    } else {
      user.id = this.listUser[this.listUser.length - 1].id + 1;
    }
    return this.listUser.push(user);
  }

  // @ts-ignore
  editUser(user: IUser, id: number) {
    for (let i = 0; i < this.listUser.length; i++) {
      // tslint:disable-next-line:triple-equals
      if (this.listUser[i].id == id) {
        this.listUser[i] = user;
      }
    }
  }
}
