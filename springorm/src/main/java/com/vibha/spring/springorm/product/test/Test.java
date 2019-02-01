package com.vibha.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vibha.spring.springorm.product.dao.ProductDao;
import com.vibha.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("com/vibha/spring/springorm/product/test/config.xml");
		ProductDao obj = (ProductDao)ctx.getBean("productDao");
		/*Product product = new Product();
		product.setId(2);
		product.setName("Mi");
		product.setDesc("Mi Product");
		product.setPrice(70);
		//obj.create(product);
		//obj.update(product);
		
		obj.delete(product);
		
		Product product = obj.find(1);
		System.out.println(product);*/
		
		List<Product> product = obj.findAll();
		System.out.println(product);
	}

}
