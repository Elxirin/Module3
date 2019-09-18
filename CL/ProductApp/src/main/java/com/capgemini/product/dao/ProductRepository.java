package com.capgemini.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.product.beans.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query("from Product where category=:category")
	List<Product> findProductByCat(@Param("category") String category);
	
}


