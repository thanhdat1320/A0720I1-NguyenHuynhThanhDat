import {Component, OnInit} from '@angular/core';
import {UserService} from '../user.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-user-search',
  templateUrl: './user-search.component.html',
  styleUrls: ['./user-search.component.css']
})
export class UserSearchComponent implements OnInit {
  keyword: string;
  listUser: IUser[] = [];
  constructor(private userService: UserService, private activatedRoute: ActivatedRoute, private router: Router) {
    this.listUser = this.userService.getAllUser();
  }

  ngOnInit(): void {
    this.keyword = this.activatedRoute.snapshot.params['keyword'];
    if (this.keyword == 'undefined') {
      this.keyword = '';
    }
    this.router.routeReuseStrategy.shouldReuseRoute = () => false ;
  }
}
