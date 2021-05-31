import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-pet',
  templateUrl: './pet.component.html',
  styleUrls: ['./pet.component.css']
})
export class PetComponent implements OnInit {
  petName = 'ABC';
  petImage = 'https://image.freepik.com/free-vector/cute-cat-super-hero-cartoon-icon-illustration-animal-hero-icon-concept-isolated-flat-cartoon-style_138676-3127.jpg';

  constructor() {
  }

  setName(name) {
    this.petName = name;
  }

  setImage(image) {
    this.petImage = image;
  }

  ngOnInit(): void {
  }

}
