package com.globant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.globant.entity.Product;
import com.globant.repository.ProductRepository;
import com.globant.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	@Qualifier("productRepository")
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(Long id) {
		productRepository.delete(id);
	}

	@Override
	public Product getProductById(Long id) {
		return productRepository.findOne(id);
	}

	@Override
	public List<Product> getProductsByName(String name) {
		return productRepository.findProductsByName(name);
	}

	@Override
	public List<Product> getProductsByCategoryName(String categoryName) {
		return productRepository.findProductsByCategory(categoryName);
	}
	
}
