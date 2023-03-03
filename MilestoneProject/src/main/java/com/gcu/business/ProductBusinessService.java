package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import com.gcu.model.ProductModel;

public class ProductBusinessService implements ProductBusinessServiceInterface
{
	List<ProductModel> products = new ArrayList<ProductModel>();
	
	public ProductBusinessService()
	{
		products.add(new ProductModel(0, "Indiana Jones Whip", "Indiana Jones: Raiders of the Lost Ark", 7, "DD/MM/YYYY", "image.jpeg", 8999.99));
		products.add(new ProductModel(1, "Darth Vaders Lightsaber", "Empire Strikes Back", 9, "DD/MM/YYYY", "image.jpeg", 18999.99));
		products.add(new ProductModel(2, "Harry Potter's Wand", "Harry Potter and the Sorcer's Stone", 6, "DD/MM/YYYY", "image.jpeg", 4999.99));
		products.add(new ProductModel(3, "Hover Board", "Back to the Future II", 8, "DD/MM/YYYY", "image.jpeg", 28999.99));
		products.add(new ProductModel(4, "Eagle 5", "Spaceballs", 8, "DD/MM/YYYY", "image.jpeg", 2999.99));
		products.add(new ProductModel(5, "Aragorn's Sword", "Lord of the Rings the Return of the King", 10, "DD/MM/YYYY", "image.jpeg", 100000.00));
		products.add(new ProductModel(6, "Photon Pack", "Ghostbusters", 7, "DD/MM/YYYY", "image.jpeg", 16999.99));
		products.add(new ProductModel(7, "Ruby Slippers", "The Wizard of Oz", 10, "DD/MM/YYYY", "image.jpeg", 99999.99));
		products.add(new ProductModel(8, "Iron Man's Suite (Damaged)", "Avengers: Endgame", 10, "DD/MM/YYYY", "image.jpeg", 999999.99));
		products.add(new ProductModel(9, "Forest's Shoes", "Forest Gump", 7, "DD/MM/YYYY", "image.jpeg", 19999.99));
	}

	@Override
	public List<ProductModel> getProducts()
	{	
		return products;
	}
	
	@Override
	public void addProduct(ProductModel product)
	{
		products.add(product);
	}

	@Override
	public List<ProductModel> searchProducts(List<ProductModel> productsToSearch, String searchTerm) 
	{
		List<ProductModel> foundItems = new ArrayList<ProductModel>();
		
		for(int i = 0; i < productsToSearch.size(); i++)
		{
			if(productsToSearch.get(i).getNameOfObject().toLowerCase().contains(searchTerm.toLowerCase()))
			{
				foundItems.add(productsToSearch.get(i));
			}
		}
			
		System.out.println("I searched for " + searchTerm + " and found " + foundItems.size() + " items.");
		return foundItems;
	}
	
}
