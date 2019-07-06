
import { IProduct } from 'src/app/product/product';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';

@Injectable({
    providedIn:'root'
})
export class ProductService{
    uri='http://localhost:4000/prod';

    constructor(private httpClient:HttpClient){ }
    items:IProduct[]=[];

    addToCart(product){
        this.items.push(product);
    }
    
    
    public getitems():Observable<IProduct[]>
    {
        return of(this.items);
    }

   /*  addOrder(id,name,price){
        let prod={
            productId:id,
            productName:name,
            price:price
        };
        return this.httpClient.post(`${this.uri}`+'/addprod',prod).subscribe(res=>console.log("Order added"));
    } */
       
    getOrder():Observable<IProduct[]>{
        return this.httpClient.get<IProduct[]>(`${this.uri}`+'/addprod');
    }

    getProducts():Observable<IProduct[]>{
        return this.httpClient.get<IProduct[]>(`${this.uri}`+'/allProd');
    }

    deleteFromCart(productId){
        this.items.pop();
    }
}