import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  product:Array<Product>=[];
  constructor(public ps:ProductService) { }

  ngOnInit(): void {
    this.loadAllProduct();
  }
  loadAllProduct(){
    this.ps.loadAllProduct().subscribe({
      next:(result:any)=>this.product=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    });
  }

}
