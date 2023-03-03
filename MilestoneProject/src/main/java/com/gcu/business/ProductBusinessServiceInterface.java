package com.gcu.business;

import java.util.List;
import com.gcu.model.ProductModel;

public interface ProductBusinessServiceInterface 
{
	public List<ProductModel> getProducts();
	public void addProduct(ProductModel product);
	public List<ProductModel> searchProducts(List<ProductModel> products, String searchTerm);
}
