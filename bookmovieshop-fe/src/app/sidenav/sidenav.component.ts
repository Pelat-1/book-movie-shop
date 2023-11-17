import { Component, Input } from '@angular/core';
import { MatDrawer } from '@angular/material/sidenav';
import { PairNameLink } from '../_model/pair-name-link';

@Component({
  selector: 'app-sidenav',
  templateUrl: './sidenav.component.html',
  styleUrls: ['./sidenav.component.css']
})
export class SidenavComponent {
   @Input()
   toggler?: MatDrawer;
   sidenav: PairNameLink[] = [
    { name: 'DASHBOARD', link: 'dashboard' },
    { name: 'IL MIO PROFILO', link: 'account' },
    { name: 'CONTINUA ACQUISTI', link: 'shop' },
    { name: 'CARRELLO', link: 'cart' }
   ];
}
