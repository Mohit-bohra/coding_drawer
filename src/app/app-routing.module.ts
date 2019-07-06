import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { OrderComponent } from './product/order/order.component';
import { ProductListComponent } from './product/product-list.component';
import { DeleteComponent } from './product/delete/delete.component';


const routes: Routes = [
  {path:'product/order',component:OrderComponent},
  {path:'product/order/delete',component:DeleteComponent},
  {path:'product/allProd',component:ProductListComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
