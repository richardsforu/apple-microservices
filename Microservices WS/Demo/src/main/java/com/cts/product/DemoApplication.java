package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.config.Test3;

@SpringBootApplication
//@ComponentScan(value = "com.cts")
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(DemoApplication.class, args);
		Test3 t = ac.getBean(Test3.class);
		t.f1();

	}

}
