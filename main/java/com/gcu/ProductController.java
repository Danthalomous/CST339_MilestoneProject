package com.gcu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.ProductBusinessServiceInterface;
import com.gcu.model.ProductModel;

@Controller
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductBusinessServiceInterface productService;
	
	List<ProductModel> products = new ArrayList<ProductModel>();
	List<ProductModel> searchProducts = new ArrayList<ProductModel>(); // MAY DELETE THIS LATER

	@GetMapping("/")
	public String showAllProducts(Model model) 
	{
		products = productService.getProducts();

		model.addAttribute("title", "All Products");
		model.addAttribute("products", products);
		return "products";
	}
	
	@GetMapping("/showAddNewProduct")
	public String showAddNewProduct(Model model)
	{
		model.addAttribute("product", new ProductModel());
		return "addProduct";
	}
	
	@PostMapping("/addProduct")
	public String addProduct(ProductModel product)
	{
		productService.addProduct(product);
		return "redirect:/products/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(value = "id") Integer id, Model model)
	{
		ProductModel product = (ProductModel) products.stream().filter(p -> p.getId() == id).findFirst().get();
		products.remove(product);
		productService.deleteProduct(id);
		return "redirect:/products/";
	}
	
	@GetMapping("/update/{id}")
	public String updateProduct(@PathVariable(value = "id") Integer id, Model model)
	{
		ProductModel product = (ProductModel) products.stream().filter(p -> p.getId() == id).findFirst().get();
		model.addAttribute("product", product);
		return "updateProduct";
	}
	
	@PostMapping("/processUpdate")
	public String processUpdate(ProductModel product)
	{
		ProductModel productToEdit = (ProductModel) products.stream().filter(p -> p.getId() == product.getId()).findFirst().get();
		productToEdit.setId(product.getId());
		productToEdit.setNameOfObject(product.getNameOfObject());
		productToEdit.setShowName(product.getShowName());
		productToEdit.setRarityValue(product.getRarityValue());
		productToEdit.setDateOfProduction(product.getDateOfProduction());
		productToEdit.setPhotoFileName(product.getPhotoFileName());
		productToEdit.setPrice(product.getPrice());
		productService.updateProduct(productToEdit.getId(), productToEdit);
		return "redirect:/products/";
	}

	@GetMapping("/search/{searchTerm}")
	public String searchProduct(@PathVariable(value="searchTerm") String searchTerm, Model model)
	{
		searchProducts = productService.searchProducts(productService.getProducts(), searchTerm);
		
		model.addAttribute("title", "Searched Product(s)");
		model.addAttribute("searchProducts", searchProducts);
		
		return "searchProducts";
	}
}
