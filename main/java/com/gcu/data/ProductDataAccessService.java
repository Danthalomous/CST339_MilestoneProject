package com.gcu.data;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gcu.model.ProductModel;

@Repository
public class ProductDataAccessService implements ProductsDataAccessInterface<ProductModel>
{
	@Autowired
	DataSource dataSource;
	JdbcTemplate jdbc;
	
	public ProductDataAccessService(DataSource dataSource)
	{
		this.dataSource = dataSource;
		jdbc = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<ProductModel> getProducts()
	{
		// Returning a list of all the products currently in the database
		return jdbc.query("SELECT * FROM products", new ProductMapper());
	}

	@Override
	public List<ProductModel> searchProducts(String searchTerm)
	{
		// Returning a list of all the products that contain characters from the searchTerm
		return jdbc.query(
				"SELECT * FROM products WHERE nameOfObject LIKE ?",
				new ProductMapper(),
				"%" + searchTerm + "%"
				);
	}

	@Override
	public int addProduct(ProductModel newProduct) 
	{
		// Inserting a new product into the database based off of the get values from the passed-in 'newProduct'
		return jdbc.update(
				"INSERT INTO products (id, nameOfObject, showName, rarityValue, dateOfProduction, photoFileName, price) VALUES (?, ?, ?, ?, ?, ?, ?)",
				newProduct.getId(),
				newProduct.getNameOfObject(),
				newProduct.getShowName(),
				newProduct.getRarityValue(),
				newProduct.getDateOfProduction(),
				newProduct.getPhotoFileName(),
				newProduct.getPrice()
				);
	}

	@Override
	public boolean deleteProduct(int id)
	{
		int returnThis = jdbc.update(
				"DELETE FROM products WHERE id = ?",
				id
				);
		
		return (returnThis > 0);
	}

	@Override
	public ProductModel updateProduct(int idToUpdate, ProductModel updateProduct)
	{
		int result = jdbc.update(
				"UPDATE products SET nameOfObject = ?, showName = ?, rarityValue = ?, dateOfProduction = ?, photoFileName = ?, price = ? WHERE id = ?",
				updateProduct.getNameOfObject(),
				updateProduct.getShowName(),
				updateProduct.getRarityValue(),
				updateProduct.getDateOfProduction(),
				updateProduct.getPhotoFileName(),
				updateProduct.getPrice(),
				idToUpdate
				);
		
		if(result > 0)
			return updateProduct;
		else
			return null;
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
