import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
   providedIn: 'root'
})
export class ApiService {
   private baseUrl: string = '//localhost:8080/';

   constructor(private http: HttpClient) { }

   getAll(nameapi: string): Observable<any> {
      var newUrl = this.baseUrl + nameapi;
      return this.http.get(newUrl);
   }

   search(nameapi: string, keyword: string): Observable<any> {
      var newUrl = this.baseUrl + nameapi;
      return this.http.post(newUrl, keyword);
   }


   saveOne(nameapi: string, data: any) {
      return this.http.post(this.baseUrl + nameapi, data);
   }
   delete(nameapi: string, id: string): Observable<any> {
      return this.http.post(this.baseUrl + nameapi, id);
   }

   getOne(nameapi: string, id: any): Observable<any> {
      return this.http.get(this.baseUrl + nameapi + '/' + id);
   }

<<<<<<< HEAD
   getData(nameapi: string): Observable<any> {
      var newUrl = this.baseUrl + nameapi;
      return this.http.get(newUrl);
=======
   filter(nameapi: string, name: string): Observable<any> {
      var newUrl = this.baseUrl + nameapi;
      return this.http.post(newUrl,name);
>>>>>>> d3c258cae859a5904febace3f5f7d0a8d4181b7c
   }

}
