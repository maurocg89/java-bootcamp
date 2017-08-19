package com.globant.service;

import java.util.List;

import com.globant.entity.Product;

public interface ProductService {

	List<Product> getAllProducts();

	Product addProduct(Product product);

	Product updateProduct(Product product);

	void deleteProduct(Long id);

	Product getProductById(Long id);

	List<Product> getProductsByName(String name);

	List<Product> getProductsByCategoryName(String categoryName);

}
