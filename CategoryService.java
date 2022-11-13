package com.prod.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.prod.dto.Category;
import com.prod.respository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public ResponseEntity<?> getAllCategories(Integer page) {
		List<Category> categoryList = (List<Category>) categoryRepository.findAll();
		if (categoryList == null) {
			return ResponseEntity.ok("something went wrong");
		} else {
			return ResponseEntity.ok(categoryList);
		}
	}

	public ResponseEntity<?> insertCategories(Category category) {
		Category result = categoryRepository.save(category);
		if (result == null) {
			return ResponseEntity.ok("something went wrong");
		} else {
			return ResponseEntity.ok("Inserted Successfully");
		}
	}

	public ResponseEntity<?> getCategoriesById(Integer id) {
		Optional<Category> category = categoryRepository.findById(id);
		if (category == null) {
			return ResponseEntity.ok("something went wrong");
		} else {
			return ResponseEntity.ok(category);
		}
	}

	public ResponseEntity<?> updateCategoriesById(Category category) {
		Category result = categoryRepository.save(category);
		if (result == null) {
			return ResponseEntity.ok("something went wrong");
		} else {
			return ResponseEntity.ok("Inserted Successfully");
		}
	}

	public void deleteCategoriesById(Integer id) {
		categoryRepository.deleteById(id);
	}

}
