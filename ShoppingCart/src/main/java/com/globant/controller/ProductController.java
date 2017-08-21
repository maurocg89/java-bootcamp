package com.globant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globant.entity.Category;
import com.globant.entity.Product;
import com.globant.service.CategoryService;
import com.globant.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	@Qualifier("productServiceImpl")
	private ProductService productService;

	@Autowired
	@Qualifier("categoryServiceImpl")
	private CategoryService categoryService;

	@GetMapping
	public ResponseEntity<List<Product>> getAllProducts() {
		return new ResponseEntity<List<Product>>(productService.getAllProducts(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Long id) {
		Product product = productService.getProductById(id);
		if (product == null) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}

	@GetMapping("/name/{name}")
	public ResponseEntity<List<Product>> getProductsByName(@PathVariable String name) {
		return new ResponseEntity<List<Product>>(productService.getProductsByName(name), HttpStatus.OK);
	}

	@GetMapping("/category/{categoryName}")
	public ResponseEntity<List<Product>> getProductsByCategoryName(@PathVariable String categoryName) {
		Category category = categoryService.getCategoryByName(categoryName);
		if (category == null) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Product>>(productService.getProductsByCategoryName(categoryName), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		return new ResponseEntity<Product>(productService.addProduct(product), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<String> updateProduct(@RequestBody Product product) {
		if (productService.getProductById(product.getId()) == null) {
			return new ResponseEntity<String>("There is no product with id: " + product.getId(), HttpStatus.NO_CONTENT);
		}
		productService.updateProduct(product);
		return new ResponseEntity<String>("Product updated: " + product, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
		Product p = productService.getProductById(id);
		if (p == null) {
			return new ResponseEntity<String>("There is no product with id: " + id, HttpStatus.NO_CONTENT);
		}
		productService.deleteProduct(id);
		return new ResponseEntity<String>("Deleted product: " + p, HttpStatus.OK);
	}

}
