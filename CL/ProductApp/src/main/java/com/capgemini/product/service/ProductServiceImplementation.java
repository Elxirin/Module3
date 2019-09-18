package com.capgemini.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.product.beans.Product;
import com.capgemini.product.dao.ProductRepository;
import com.capgemini.product.exceptions.ProductException;

@Service
public class ProductServiceImplementation implements ProductService{
	
	@Autowired
	private ProductRepository prodRepo;
	
	@Override
	public List<Product> getAllProducts() throws ProductException {
		try {
			return prodRepo.findAll();
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		}
	}

	@Override
	public List<Product> addProduct(Product pr) throws ProductException {
		if(prodRepo.existsById(pr.getId())) {
			throw new ProductException("Product with id "+pr.getId()+" already existing");
		}
		else {
			prodRepo.save(pr);
			return getAllProducts();
		}
	}

	@Override
	public Product getProductById(int id) throws ProductException {
		
		if(!prodRepo.existsById(id)) {
			throw new ProductException("Product with id "+id+" does not exists");
		}else {
			return prodRepo.findById(id).get();
		}
	}

	@Override
	public List<Product> deleteProduct(int id) throws ProductException {
		if(!prodRepo.existsById(id)) {
			throw new ProductException("Product with id "+id+" does not exists");
		}
		else {
			prodRepo.deleteById(id);
			return getAllProducts();
		}
	}

	@Override
	public List<Product> updateProduct(Product pr) throws ProductException {
		if(!prodRepo.existsById(pr.getId())) {
			throw new ProductException("Product with id "+pr.getId()+" does not exists");
		}
		else {
			prodRepo.save(pr);
			return getAllProducts();
		}
	}
	
	

	@Override
	public List<Product> getProductByCat(String category) throws ProductException {
		
		return prodRepo.findProductByCat(category);
	}


}
