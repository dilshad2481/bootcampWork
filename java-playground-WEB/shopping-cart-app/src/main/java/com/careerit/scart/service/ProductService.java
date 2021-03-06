package com.careerit.scart.service;

import java.util.List;

import com.careerit.scart.domain.Product;

public interface ProductService {
	Product addProduct(Product product);

	List<Product> getProducts();

	Product getProduct(Long pid);

	List<Product> search(String str);

	boolean removeProduct(Long pid);

	Product updateProduct(Product product);
	
}
