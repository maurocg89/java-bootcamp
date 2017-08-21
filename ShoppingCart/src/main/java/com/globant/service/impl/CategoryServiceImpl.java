package com.globant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.globant.entity.Category;
import com.globant.repository.CategoryRepository;
import com.globant.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	@Qualifier("categoryRepository")
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	@Override
	public Category addCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public Category updateCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public void deleteCategory(Long id) {
		try {
			categoryRepository.delete(id);
		} catch (Exception e) {

		}
	}

	@Override
	public Category getCategoryById(Long id) {
		Category category = new Category();
		try {
			category = categoryRepository.findOne(id);
		} catch (Exception e) {

		}
		return category;
	}

	@Override
	public Category getCategoryByName(String name) {
		Category category = new Category();
		try {
			category = categoryRepository.findCategoryByName(name);
		} catch (Exception e) {

		}
		return category;
	}

}
