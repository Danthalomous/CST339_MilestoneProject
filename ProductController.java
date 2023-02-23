package com.gcu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.ProductBusinessServiceInterface;
import com.gcu.model.ProductModel;

@Controller
@RequestMapping("/products")
public class ProductController 
{
	@Autowired
	private ProductBusinessServiceInterface productServce;
	
	@GetMapping("/")
	public String showAllProducts(Model model)
	{
		List<ProductModel> products = productServce.getProducts();
		
		model.addAttribute("title", "All Products");
		model.addAttribute("products", products);
		return "products";
	}
}
