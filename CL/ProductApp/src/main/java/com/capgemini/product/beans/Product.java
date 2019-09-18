package com.capgemini.product.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
public class Product {
	
	@Id
	@SequenceGenerator(name = "prodIdGen", sequenceName = "prodId", initialValue = 5001, allocationSize = 1)
	@GeneratedValue(generator = "prodIdGen", strategy = GenerationType.SEQUENCE)
	private int id;
	
	@NotEmpty(message = "Name is Empty")
	@Pattern(regexp = "[A-Z][A-Za-z]{2,}", message="First Letter should be Capital and must contain only letters")
	private String name;
	@Pattern(regexp = "(Mobile|Laptop|TV)", message = "Category should be Mobile, TV, Laptops")
	private String category;
	@Min(1)
	private int quantity;
	
	private Double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", quantity=" + quantity + ", price="
				+ price + "]";
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	

}
