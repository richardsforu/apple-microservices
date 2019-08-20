package com.cts.product.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cts.product.Test1;

@Component
public class Test3 {
	
	@Autowired
	Test1 t1;

	public void f1() {
		System.out.println("--- Test3 f1 method");
		t1.f1();
	}

}
