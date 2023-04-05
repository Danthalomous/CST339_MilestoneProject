package com.gcu.data;

import java.util.List;

public interface ProductsDataAccessInterface<T>
{
	public List<T> getProducts();
	public List<T> searchProducts(String searchTerm);
	public int addProduct(T newProduct);
	public boolean deleteProduct(int id);
	public T updateProduct(int idToUpdate, T updateProduct);
	public void init();
	public void destroy();
}
