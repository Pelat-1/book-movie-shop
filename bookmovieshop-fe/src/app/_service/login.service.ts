import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ErrorResponse } from '../_model/error-response';
import { LoginRequest } from '../_model/login-request';
import { LoginResponse } from '../_model/login-response';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient) { }

  login(loginRequest: LoginRequest): Observable<LoginResponse | ErrorResponse> {
    return this.http.post<LoginResponse | ErrorResponse>('http://localhost:8080/login', loginRequest);
  }
}
