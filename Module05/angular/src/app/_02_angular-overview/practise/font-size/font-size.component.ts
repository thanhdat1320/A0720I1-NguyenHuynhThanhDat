import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-font-size',
  templateUrl: './font-size.component.html',
  styleUrls: ['./font-size.component.css']
})
export class FontSizeComponent implements OnInit {
  count = 5;

  @Output()
  countChanged: EventEmitter<number> = new EventEmitter<number>();

  fontSize = 10;
  constructor() { }

  ngOnInit(): void {
  }

  increase() {
    this.count++;
    this.countChanged.emit(this.count);
  }

  decrease() {
    this.count--;
    this.countChanged.emit(this.count);

  }
}
