package com.gcu.model;

public class ProductModel
{
	// Variable Initilization
	String nameOfObject = "";
	String showName = "";
	int rarityValue = 1; // Between 1-10
	String dateOfProduction = ""; // TODO: Change this to correct data type for database in the future
	String photoFileName = ""; // JPEG
	double price = 0.0;
	
	/**
	 * @param nameOfObject
	 * @param showName
	 * @param rarityValue
	 * @param dateOfProduction
	 * @param photoFileName
	 * @param price
	 */
	public ProductModel(String nameOfObject, String showName, int rarityValue, String dateOfProduction,
			String photoFileName, double price) 
	{
		super();
		this.nameOfObject = nameOfObject;
		this.showName = showName;
		this.rarityValue = rarityValue;
		this.dateOfProduction = dateOfProduction;
		this.photoFileName = photoFileName;
		this.price = price;
	}
	
	/**
	 * @return the nameOfObject
	 */
	public String getNameOfObject()
	{
		return nameOfObject;
	}
	
	/**
	 * @return the showName
	 */
	public String getShowName() 
	{
		return showName;
	}
	/**
	 * @return the rarityValue
	 */
	public int getRarityValue() {
		return rarityValue;
	}
	
	/**
	 * @return the dateOfProduction
	 */
	public String getDateOfProduction() 
	{
		return dateOfProduction;
	}
	
	/**
	 * @return the photoFileName
	 */
	public String getPhotoFileName()
	{
		return photoFileName;
	}
	
	/**
	 * @return the price
	 */
	public double getPrice()
	{
		return price;
	}
	
	/**
	 * @param nameOfObject the nameOfObject to set
	 */
	public void setNameOfObject(String nameOfObject)
	{
		this.nameOfObject = nameOfObject;
	}
	
	/**
	 * @param showName the showName to set
	 */
	public void setShowName(String showName)
	{
		this.showName = showName;
	}
	
	/**
	 * @param rarityValue the rarityValue to set
	 */
	public void setRarityValue(int rarityValue) 
	{
		this.rarityValue = rarityValue;
	}
	
	/**
	 * @param dateOfProduction the dateOfProduction to set
	 */
	public void setDateOfProduction(String dateOfProduction) 
	{
		this.dateOfProduction = dateOfProduction;
	}
	
	/**
	 * @param photoFileName the photoFileName to set
	 */
	public void setPhotoFileName(String photoFileName) 
	{
		this.photoFileName = photoFileName;
	}
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	
}
