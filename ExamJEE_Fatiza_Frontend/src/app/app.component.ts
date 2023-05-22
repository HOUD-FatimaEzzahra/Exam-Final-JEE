import { Component } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private router: Router) {}
  title = 'z';
  isNavbarVisible(): boolean {
    return this.router.url !== '/auth'; // Remplacez '/auth' par la route réelle de votre composant AuthComponent
  }
}
