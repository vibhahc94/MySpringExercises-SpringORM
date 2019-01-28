package com.vibha.spring.springorm.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vibha.spring.springorm.product.dao.ProductDao;
import com.vibha.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("com/vibha/spring/springorm/product/test/config.xml");
		ProductDao obj = (ProductDao)ctx.getBean("productDao");
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDesc("Apple Product");
		product.setPrice(700);
		obj.create(product);

	}

}
