package com.capgemini.product.service;

import java.util.List;

import com.capgemini.product.beans.Product;
import com.capgemini.product.exceptions.ProductException;

public interface ProductService {
	
	List<Product> getAllProducts() throws ProductException;
	List<Product> addProduct(Product pr) throws ProductException;
	Product getProductById(int id) throws ProductException;
	List<Product> deleteProduct(int id) throws ProductException;
	List<Product> updateProduct(Product pr)  throws ProductException;
	List<Product> getProductByCat(String category) throws ProductException;
}
