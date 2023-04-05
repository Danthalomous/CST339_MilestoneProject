package com.gcu.data;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("products")
public class ProductEntity
{
	@Id
	@Column("id")
	int id;
	
	@Column("nameOfObject")
	String nameOfObject;
	
	@Column("showName")
	String showName;
	
	@Column("rarityValue")
	int rarityValue; // Between 1-10
	
	@Column("dateOfProduction")
	Date dateOfProduction; // TODO: Change this to correct data type for database in the future
	
	@Column("photoFileName")
	String photoFileName; // JPEG
	
	@Column("price")
	double price;

	/**
	 * @param id
	 * @param nameOfObject
	 * @param showName
	 * @param rarityValue
	 * @param dateOfProduction
	 * @param photoFileName
	 * @param price
	 */
	public ProductEntity(int id, String nameOfObject, String showName, int rarityValue, Date dateOfProduction,
			String photoFileName, double price)
	{
		super();
		this.id = id;
		this.nameOfObject = nameOfObject;
		this.showName = showName;
		this.rarityValue = rarityValue;
		this.dateOfProduction = dateOfProduction;
		this.photoFileName = photoFileName;
		this.price = price;
	}

	/**
	 * 
	 */
	public ProductEntity()
	{
		super();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the nameOfObject
	 */
	public String getNameOfObject() {
		return nameOfObject;
	}

	/**
	 * @return the showName
	 */
	public String getShowName() {
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
	public Date getDateOfProduction() {
		return dateOfProduction;
	}

	/**
	 * @return the photoFileName
	 */
	public String getPhotoFileName() {
		return photoFileName;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param nameOfObject the nameOfObject to set
	 */
	public void setNameOfObject(String nameOfObject) {
		this.nameOfObject = nameOfObject;
	}

	/**
	 * @param showName the showName to set
	 */
	public void setShowName(String showName) {
		this.showName = showName;
	}

	/**
	 * @param rarityValue the rarityValue to set
	 */
	public void setRarityValue(int rarityValue) {
		this.rarityValue = rarityValue;
	}

	/**
	 * @param dateOfProduction the dateOfProduction to set
	 */
	public void setDateOfProduction(Date dateOfProduction) {
		this.dateOfProduction = dateOfProduction;
	}

	/**
	 * @param photoFileName the photoFileName to set
	 */
	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
