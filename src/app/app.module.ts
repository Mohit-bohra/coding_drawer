import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductListComponent } from './product/product-list.component';
import { OrderComponent } from './product/order/order.component';
import { ProductService } from './product/service/prod-service.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { DeleteComponent } from './product/delete/delete.component';




@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent,
    OrderComponent,
    DeleteComponent,   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
