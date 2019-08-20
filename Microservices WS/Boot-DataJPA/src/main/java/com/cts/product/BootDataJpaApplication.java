package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.dao.ProductDao;

@SpringBootApplication
public class BootDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(BootDataJpaApplication.class, args);
		ProductDao dao = ac.getBean(ProductDao.class);

		dao.findAll().forEach((prod) -> {
			System.out.println(prod.getProdId());
			System.out.println(prod.getProdName());
			System.out.println(prod.getPrice());
			System.out.println("-----------------------------");
		});

	}

}
