import { Numberz } from './numberz';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class NumVerifyService {
  private baseURL = "http://localhost:8090/api/v1/validate";
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }
  constructor(private httpClient: HttpClient) { }

  validateNumber(number: string) : Observable<Numberz>{
    return this.httpClient.get<Numberz>(`${this.baseURL}/${number}`);
  }
  history() : Observable<Numberz[]>
  {
    return this.httpClient.get<Numberz[]>(`${this.baseURL}/history`);
  }
}
