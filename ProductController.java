package com.prod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prod.dto.Products;
import com.prod.service.ProductService;

@RestController
@RequestMapping("/api/")
public class ProductController {

	@Autowired 
	private ProductService productService;
	
	@RequestMapping("products")
	public ResponseEntity<?> getAllProducts(@RequestParam Integer page) {

		return productService.getAllProducts(page);
	}

	@RequestMapping("categories")
	public ResponseEntity<?> insertProducts(@RequestBody Products products) {

		return productService.insertProducts(products);
	}

	@RequestMapping("categories")
	public ResponseEntity<?> getProductsById(@PathVariable Integer id) {

		return productService.getProductsById(id);
	}

	@RequestMapping("categories")
	public ResponseEntity<?> updateProductsById(@RequestBody Products products) {
		return productService.updateProductsById(products);

	}

	@RequestMapping("categories")
	public ResponseEntity<?> deleteProductsById(@PathVariable Integer id) {

		productService.deleteProductsById(id);

		return ResponseEntity.ok("Deleted successfully");
	}
}
