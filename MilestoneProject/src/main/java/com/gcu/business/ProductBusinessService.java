package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import com.gcu.model.ProductModel;

public class ProductBusinessService implements ProductBusinessServiceInterface
{

	@Override
	public List<ProductModel> getProducts()
	{
		// Creating an arraylist that stores our hard coded products TODO: REMOVE THIS LATER
		List<ProductModel> products = new ArrayList<ProductModel>();
		
		products.add(new ProductModel("Indiana Jones Whip", "Indiana Jones: Raiders of the Lost Ark", 7, "DD/MM/YYYY", "image.jpeg", 8999.99));
		products.add(new ProductModel("Darth Vaders Lightsaber", "Empire Strikes Back", 9, "DD/MM/YYYY", "image.jpeg", 18999.99));
		products.add(new ProductModel("Harry Potter's Wand", "Harry Potter and the Sorcer's Stone", 6, "DD/MM/YYYY", "image.jpeg", 4999.99));
		products.add(new ProductModel("Hover Board", "Back to the Future II", 8, "DD/MM/YYYY", "image.jpeg", 28999.99));
		products.add(new ProductModel("Eagle 5", "Spaceballs", 8, "DD/MM/YYYY", "image.jpeg", 2999.99));
		products.add(new ProductModel("Aragorn's Sword", "Lord of the Rings the Return of the King", 10, "DD/MM/YYYY", "image.jpeg", 100000.00));
		products.add(new ProductModel("Photon Pack", "Ghostbusters", 7, "DD/MM/YYYY", "image.jpeg", 16999.99));
		products.add(new ProductModel("Ruby Slippers", "The Wizard of Oz", 10, "DD/MM/YYYY", "image.jpeg", 99999.99));
		products.add(new ProductModel("Iron Man's Suite (Damaged)", "Avengers: Endgame", 10, "DD/MM/YYYY", "image.jpeg", 999999.99));
		products.add(new ProductModel("Forest's Shoes", "Forest Gump", 7, "DD/MM/YYYY", "image.jpeg", 19999.99));
		
		return products;
	}
	
}
