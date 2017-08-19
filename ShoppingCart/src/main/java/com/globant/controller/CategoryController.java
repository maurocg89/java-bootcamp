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
import com.globant.service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired
	@Qualifier("categoryServiceImpl")
	private CategoryService categoryService;
	
	@GetMapping
	public ResponseEntity<List<Category>> getAllCategories(){
		return new ResponseEntity<List<Category>>(categoryService.getAllCategories(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Category> getCategoryById(@PathVariable Long id){
		return new ResponseEntity<Category>(categoryService.getCategoryById(id), HttpStatus.OK);
	}
	
	
	// Add a filter (%like)
	@GetMapping("/name/{name}")
	public ResponseEntity<Category> getCategoryByName(@PathVariable String name){
		return new ResponseEntity<Category>(categoryService.getCategoryByName(name), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Category> addCategory(@RequestBody Category category){
		return new ResponseEntity<Category>(categoryService.addCategory(category), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<String> updateCategory(@RequestBody Category category){
		Category cat = categoryService.getCategoryById(category.getId());
		if (cat == null) {
			return new ResponseEntity<String>("There is no category with id: " + category.getId(), HttpStatus.NOT_FOUND);
		}
		categoryService.updateCategory(category);
		return new ResponseEntity<String>("Category updated: " + category, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCategory(@PathVariable Long id){
		Category cat = categoryService.getCategoryById(id);
		if (cat == null) {
			return new ResponseEntity<String>("There is no category with id: " + id, HttpStatus.NOT_FOUND);
		}
		categoryService.deleteCategory(id);
		return new ResponseEntity<String>("Category deleted: " + cat, HttpStatus.OK);
	}
	
}
