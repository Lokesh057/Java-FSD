package com.controller;

import org.springframework.http.MediaType;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;

@RestController
@RequestMapping("product")
@CrossOrigin()   //it helps to enable to access the resources
public class ProductController {
	@GetMapping(value = "allProduct", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProduct(){
		List<Product>listOfProduct = new ArrayList<Product>();
		listOfProduct.add(new Product(1,"TV", 40000, "https://www.mylloyd.com/media/products/zoom1-min.jpg"));
		listOfProduct.add(new Product(2,"Computer", 35000, "https://cdn.xxl.thumbs.canstockphoto.com/3d-illustration-of-black-desktop-computer-over-white-background-stock-images_csp8241665.jpg"));
		listOfProduct.add(new Product(3,"Laptop", 80000, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTud4SunAfbVgjIfFe723uO35Wc5dV1En5HklH0HJhT&s"));
		listOfProduct.add(new Product(4,"PenDrive", 700, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcThelOIDi6RNzv7OC65BRpYJhazCWVUQJMFzfMZnQZq&s"));
		return listOfProduct;
	}

}
