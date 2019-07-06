const express=require('express');
const app=express();
//we are creating api link for product
const apiProdRouter=express.Router();
let Product=require('./product');

apiProdRouter.route('/add').get((req,res)=>{
    
    let body_order=new Product(req.body);
    body_order.save().then(
        ()=>{res.send("New Order")},(err)=>{res.send("Failure")}
    );
});



apiProdRouter.route('/allProd').get((req,res)=>{
    
    Product.find((err,data)=>{
         if(err){
             res.send("Failure");
         }
         res.send(data);
     });
 });
module.exports=apiProdRouter;
