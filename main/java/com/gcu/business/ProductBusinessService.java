package com.gcu.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.ProductDataAccessService;
import com.gcu.model.ProductModel;

public class ProductBusinessService implements ProductBusinessServiceInterface
{
	// List<ProductModel> products = new ArrayList<ProductModel>();
	
	@Autowired
	ProductDataAccessService productsDAO;
	
	public ProductBusinessService()
	{
		
	}

	@Override
	public List<ProductModel> getProducts()
	{	
		return productsDAO.getProducts();
	}
	
	@Override
	public void addProduct(ProductModel product)
	{
		productsDAO.addProduct(product);
	}

	@Override
	public List<ProductModel> searchProducts(List<ProductModel> productsToSearch, String searchTerm) 
	{
		return productsDAO.searchProducts(searchTerm);
	}

	@Override
	public ProductModel updateProduct(int id, ProductModel updateProduct) 
	{
		return productsDAO.updateProduct(id, updateProduct);
	}

	@Override
	public boolean deleteProduct(int id)
	{
		return productsDAO.deleteProduct(id);
	}
	
}
