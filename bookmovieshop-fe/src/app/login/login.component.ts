import { Component } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  email: FormControl = new FormControl('', [Validators.required, Validators.email]);
  password: FormControl = new FormControl('', [Validators.required, Validators.minLength(6), Validators.maxLength(12), Validators.pattern(new RegExp('[A-Z]/i')), Validators.pattern(new RegExp('[a-z]/i'))]);
  hide: boolean = true;

  getErrorMessage(): string {
    if (this.email.hasError('required')) {
      return 'You must enter a mail';
    }

    return this.email.hasError('email') ? 'Not a valid email' : '';
  }
}
