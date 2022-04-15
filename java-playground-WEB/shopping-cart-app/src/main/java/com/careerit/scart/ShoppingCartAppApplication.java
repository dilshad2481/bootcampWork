package com.careerit.scart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.careerit.scart.repo.ProductRepo;

@SpringBootApplication(scanBasePackages={
		"com.careerit"})
public class ShoppingCartAppApplication implements CommandLineRunner {

	@Autowired
	private ProductRepo productRepo;
	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartAppApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
//		Product product = new Product();
//		product.setDescription("i7 with 16 GB RAM");
//		product.setName("Lenovo Thinkpad");
//		product.setPrice(75000);
//		product.setStatus(true);
//		
//		
//		product=productRepo.save(product);
//		System.out.println("");
		
		productRepo.findAll().stream().forEach(p->{
			System.out.println(p.getName());
		});
	}

}
