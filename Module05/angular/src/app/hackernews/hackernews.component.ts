import { Component, OnInit } from '@angular/core';
import {listHackernews} from './list-hackernews';

@Component({
  selector: 'app-hackernews',
  templateUrl: './hackernews.component.html',
  styleUrls: ['./hackernews.component.css']
})
export class HackernewsComponent implements OnInit {
  listHackernews = listHackernews;
  constructor() { }

  ngOnInit(): void {
  }

}
