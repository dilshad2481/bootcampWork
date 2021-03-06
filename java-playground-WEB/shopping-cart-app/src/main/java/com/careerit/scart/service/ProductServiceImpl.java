package com.careerit.scart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.careerit.scart.domain.Product;
import com.careerit.scart.repo.ProductRepo;
import com.careerit.scart.service.exception.ProductNotFoundException;

import lombok.extern.slf4j.Slf4j;

@Service //Also equal to component
//It indicates that this class is service class = Contains business logic

@Slf4j //For logging
public class ProductServiceImpl implements ProductService {
//Service = Bussiness class logic
	private ProductRepo productRepo;

	@Autowired //Added final parameter to make it mandatory requirement
	public ProductServiceImpl(final ProductRepo productRepo) {
		this.productRepo = productRepo;
	}

	@Override
	public Product addProduct(Product product) {
		Assert.notNull(product, "Product object can't null");
		Assert.hasText(product.getName(), "Product name can't be empty");
		Assert.state(product.getPrice() > 0, "Product price can't be <=0 ");
		product = productRepo.save(product);
		log.info("Product is added with id :{}", product.getPid());
		return product;
	}

	@Override
	public List<Product> getProducts() {
		List<Product> list = productRepo.findAll();
		log.info("Total product count is :{}", list.size());
		return list;
	}

	@Override
	public Product getProduct(Long pid) {
		Optional<Product> optProduct = productRepo.findById(pid);
		if (optProduct.isPresent()) {
			return optProduct.get();
		}
		throw new ProductNotFoundException("Product with id " + pid + " is not found");
	}

	@Override
	public List<Product> search(String str) {
		
		List<Product> list = productRepo.searchByTitleLike(str);
		
		log.info("For given search str :{} the matched record count is:{}", str, list.size());
		return list;
	}

	@Override
	public boolean removeProduct(Long pid) {
		Optional<Product> optProduct = productRepo.findById(pid);
		if (optProduct.isPresent()) {
			Product product = optProduct.get();
			productRepo.delete(product);
			return true;
		}
		throw new ProductNotFoundException("Product with id " + pid + " is not found");
	}

	@Override
	public Product updateProduct(Product product) {
		Assert.notNull(product, "Product object can't null");
		Assert.hasText(product.getName(), "Product name can't be empty");
		Assert.state(product.getPrice() > 0, "Product price can't be <=0 ");
		//If Id is available in product than it thinks that we want to update
		//If Id is not available its going to create new product
		product = productRepo.save(product);
		log.info("Product with id :{} is updated", product.getPid());
		return product;
		
	}

}