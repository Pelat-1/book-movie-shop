import { Component } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { ErrorResponse } from '../_model/error-response';
import { LoginRequest } from '../_model/login-request';
import { LoginResponse } from '../_model/login-response';
import { LoginService } from '../_service/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  email: FormControl = new FormControl('', [Validators.required, Validators.email]);
  password: FormControl = new FormControl('', [Validators.required, Validators.minLength(6), Validators.maxLength(12), Validators.pattern(new RegExp('[A-Z]/i')), Validators.pattern(new RegExp('[a-z]/i'))]);
  hide: boolean = true;
  loginRequest: LoginRequest = { email: '', password: ''};

  constructor(private loginService: LoginService) {}

  getErrorMessage(): string {
    if (this.email.hasError('required')) {
      return 'You must enter a mail';
    }
    return this.email.hasError('email') ? 'Not a valid email' : '';
  }

  login(): void {
    console.log('LoginRequest:');
    console.log(this.loginRequest);
    this.loginService.login(this.loginRequest)
          .subscribe((loginResult: LoginResponse | ErrorResponse) => {
            if ('code' in loginResult) {
              console.error('LOGIN ERROR: ' + JSON.stringify(this.loginRequest));
            } else {
            }
    })
  }
}
