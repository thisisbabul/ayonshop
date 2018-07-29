package com.sweetitech.ayonshop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.lang.Nullable;

@Entity
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	@Size(max=100000)
	private int price;
	
	@NotEmpty
	@NumberFormat
	@Size(max=100)
	private int profitPercentage;
	
	@NotEmpty
	private String productType;
	
	@Nullable
	private boolean isSold;
	
	@NumberFormat
	@Nullable
	private int productSoldCount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public boolean isSold() {
		return isSold;
	}

	public void setSold(boolean isSold) {
		this.isSold = isSold;
	}

	public int getProductSoldCount() {
		return productSoldCount;
	}

	public void setProductSoldCount(int productSoldCount) {
		this.productSoldCount = productSoldCount;
	}

	public Product(Long id, @NotEmpty String name, @NotEmpty int price,
			@NotEmpty int profitPercentage, @NotEmpty String productType,
			boolean isSold, int productSoldCount) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.profitPercentage = profitPercentage;
		this.productType = productType;
		this.isSold = isSold;
		this.productSoldCount = productSoldCount;
	}

	public Product(@NotEmpty String name, @NotEmpty int price,
			@NotEmpty int profitPercentage, @NotEmpty String productType,
			boolean isSold, int productSoldCount) {
		
		this.name = name;
		this.price = price;
		this.profitPercentage = profitPercentage;
		this.productType = productType;
		this.isSold = isSold;
		this.productSoldCount = productSoldCount;
	}
	
	
	
}	
