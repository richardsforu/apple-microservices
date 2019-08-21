package com.cts.cart.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/carts")
public class CartRestController {
	
	@GetMapping
	public String f1() {
		return "Hello from CartRestComtroller";
	}
	

}
