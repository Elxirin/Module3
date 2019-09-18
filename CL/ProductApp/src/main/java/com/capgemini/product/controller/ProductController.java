package com.capgemini.product.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.product.beans.Product;
import com.capgemini.product.exceptions.ProductException;
import com.capgemini.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService prodService;
	
	@RequestMapping("/products")
	public List<Product> getAllProducts() throws ProductException {
		return prodService.getAllProducts();
	}
	
	@PostMapping("/products")
	public List<Product> addProduct(@Valid @RequestBody Product pr) throws ProductException {
		return prodService.addProduct(pr);
	}
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable int id) throws ProductException {
		return prodService.getProductById(id);
	}
	
	@DeleteMapping("/products/{id}")
	public List<Product> deleteProduct(@PathVariable int id) throws ProductException {
		return prodService.deleteProduct(id);
	}
	
	@PutMapping("/products/update")
	public List<Product> updateProduct(@RequestBody Product pr) throws ProductException {
		return prodService.updateProduct(pr);
	}
	
	@GetMapping("/products/category")
	public List<Product> getProductByCat(@RequestParam String category) throws ProductException {
		return prodService.getProductByCat(category);
	}
	
	
	
	
	
	
}
