package com.prod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prod.dto.Category;
import com.prod.service.CategoryService;

@RestController
@RequestMapping("/api/")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@RequestMapping("categories")
	public ResponseEntity<?> getAllCategories(@RequestParam Integer page) {
		
		return categoryService.getAllCategories(page);
	}

	@RequestMapping("categories")
	public ResponseEntity<?> insertCategories(@RequestBody Category category) {
		
		return categoryService.insertCategories(category);
	}

	@RequestMapping("categories")
	public ResponseEntity<?> getCategoriesById(@PathVariable Integer id) {
		
		return categoryService.getCategoriesById(id);
	}

	@RequestMapping("categories")
	public ResponseEntity<?> updateCategoriesById(@RequestBody Category category) {
		return categoryService.updateCategoriesById(category);

	}

	@RequestMapping("categories")
	public ResponseEntity<?> deleteCategoriesById(@PathVariable Integer id) {
		
		  categoryService.deleteCategoriesById(id);
		  
		  return ResponseEntity.ok("Deleted successfully");
	}
}
