package com.sweetitech.ayonshop.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sweetitech.ayonshop.dto.ProductForm;
import com.sweetitech.ayonshop.entity.Product;
import com.sweetitech.ayonshop.service.ProductService;

@Controller
public class AyonshopController {
	
	@Autowired
	private ProductService productservice;
	
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String showAbout(){
		return "about";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLogin(){
		return "login";
	}
	
	@RequestMapping(value="/dashboard", method=RequestMethod.GET)
	public String showdashboard(){
		return "dashboard";
	}
	
	@RequestMapping(value="/addproduct", method=RequestMethod.GET)
	public String addProduct(){
		return "addproduct";
	}
	
	@RequestMapping(value="/doaddproduct", method=RequestMethod.POST)
	public String doAddProduct(@Valid ProductForm productForm, BindingResult result, WebRequest request, RedirectAttributes redirectAttributes){
		
		if(result.hasErrors()){
			redirectAttributes.addAttribute("error", "Please form validation");
			return "redirect:/addproduct";
		}
		
		String name = request.getParameter("name");
		int price = Integer.parseInt(request.getParameter("price"));
		int profitPercentage = Integer.parseInt(request.getParameter("profit_percentage"));
		String productType = request.getParameter("product_type");
		
		boolean isSold = Boolean.parseBoolean(request.getParameter("is_sold"));
		
		int productSoldCount = Integer.parseInt(request.getParameter("product_sold_count"));
		Product product = new Product(name,price, profitPercentage, productType, isSold, productSoldCount);
		
		productservice.save(product);
		
		return "addproduct";
	}
	
	@RequestMapping(value="/updateproduct", method=RequestMethod.GET)
	public String updateProduct(){
		return "updateproduct";
	}
	
	@RequestMapping(value="/allproducts", method=RequestMethod.GET)
	public String allProducts(Model model){
		List<Product> productList = productservice.getAllProducts();
		model.addAttribute("productList", productList);
		return "allproducts";
	}
}
