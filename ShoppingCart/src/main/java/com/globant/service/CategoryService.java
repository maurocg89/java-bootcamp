package com.globant.service;

import java.util.List;

import com.globant.entity.Category;

public interface CategoryService {

	List<Category> getAllCategories();

	Category addCategory(Category category);

	Category updateCategory(Category category);

	void deleteCategory(Long id);

	Category getCategoryById(Long id);

	Category getCategoryByName(String name);

}
