package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.product.dao.ProductDao;
import com.cts.product.entities.Product;
@RefreshScope

@RestController
@RequestMapping("api/products")
@CrossOrigin
public class ProductRestController {
	
	@Autowired
	private ProductDao dao;
	
	
	
	

	
	
	@GetMapping
	public List<Product> listAll(){
		
		//String msg=rt.getForObject("http://localhost:8082/api/cart", String.class);
		
		
		return dao.findAll();
	}

}
