package com.careerit.scart.web;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerit.scart.domain.Product;
import com.careerit.scart.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@RestController //Allows it to handle request
//It is used for REST website
@RequestMapping("/product")
@Slf4j
@EnableAutoConfiguration

//@ComponentScan(basePackages="com.careerit")


public class ProductController {

	private ProductService productService;

	@Autowired //Don't need to write autowired whenever you doing
	//Constructor injection
	public ProductController(final ProductService productService) {
		this.productService = productService;
	}

	@PostMapping//("/addproduct")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	@PutMapping
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
	
	@GetMapping("/all")
	public List<Product> getProducts() {
		return productService.getProducts();
	}
	
	@GetMapping("/")
	public String greetings() {
		return "Welcome to spring boot REST api";
	}

	

	@DeleteMapping("/{pid}")
	public String deleteProduct(@PathVariable("pid") Long pid) {
		boolean res = productService.removeProduct(pid);
		return res ? "Product is deleted" : "Product is not found for given id";
	}

	@GetMapping("/search")
	public List<Product> search(HttpServletRequest request) {
		String str = request.getParameter("str");
		log.info("Search String is :{}",str);
		return productService.search(str);
	}

	

}