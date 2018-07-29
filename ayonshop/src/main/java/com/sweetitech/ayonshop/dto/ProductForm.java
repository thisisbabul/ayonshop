package com.sweetitech.ayonshop.dto;


import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;

public class ProductForm {
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	@Size(max=100000, min=2000)
	private int price;
	
	@NotEmpty
	@NumberFormat
	@Size(max=100, min=2)
	private int profitPercentage;
	
	@NotEmpty
	private String productType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getProfitPercentage() {
		return profitPercentage;
	}

	public void setProfitPercentage(int profitPercentage) {
		this.profitPercentage = profitPercentage;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	
	
}	
