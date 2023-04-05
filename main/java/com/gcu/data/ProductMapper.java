package com.gcu.data;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gcu.model.ProductModel;

public class ProductMapper implements RowMapper<ProductModel>
{
	public ProductModel mapRow(ResultSet resultSet, int i) throws SQLException
	{	
		ProductModel product = new ProductModel(
			resultSet.getInt("id"),	
			resultSet.getString("nameOfObject"),
			resultSet.getString("showName"),
			resultSet.getInt("rarityValue"),
			resultSet.getDate("dateOfProduction"),
			resultSet.getString("photoFileName"),
			resultSet.getDouble("price")
			);
		
		return product;
	}
}
