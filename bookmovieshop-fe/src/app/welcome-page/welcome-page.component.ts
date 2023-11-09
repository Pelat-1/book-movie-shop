import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-welcome-page',
  templateUrl: './welcome-page.component.html',
  styleUrls: ['./welcome-page.component.css']
})
export class WelcomePageComponent implements OnInit {

  slides: any[] = new Array(3).fill({id: -1, src: '', title: '', subtitle: ''});

  constructor() {}

  ngOnInit(): void {
    this.slides[0] = {
      src: './assets/img/movie0.jpg'
    };
    this.slides[1] = {
      src: './assets/img/movie1.jpg'
    };
    this.slides[2] = {
      src: './assets/img/movie2.jpg'
    };
  }

  onItemChange($event: Number): void {
    console.log('Carousel onItemChange', $event);
  }
}
