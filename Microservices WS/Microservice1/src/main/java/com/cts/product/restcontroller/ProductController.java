package com.cts.product.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.model.Product;

@RestController
@RequestMapping("api/products")
public class ProductController {

	@GetMapping
	public String f1() {
		return "Hellow from Product Controller";
	}

	@GetMapping("product")
	public Product f2() {
		Product prod = new Product();
		prod.setPrice(65.34);
		prod.setProdId("P001");
		prod.setProdName("Book");

		return prod;

	}

}
