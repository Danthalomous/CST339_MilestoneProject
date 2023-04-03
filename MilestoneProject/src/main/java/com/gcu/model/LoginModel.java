package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginModel
{
	Long id = 0L;

	@NotNull(message="Username is a required field")
	@Size(min=1, max=32, message="Username must be between 1 and 32 characters")
	String username;
	
	@NotNull(message="Password is a required field")
	@Size(min=1, max=32, message="Password must be between 1 and 32 characters")
	String password;
	
	int admin = 0;

	public LoginModel(Long id, String username, String password, int admin){
		this.id = id;
		this.username = username;
		this.password = password;
		this.admin = admin;
	}

	public LoginModel() {
	}

	/**
	 * Getter for username
	 * @return
	 */
	public String getUsername()
	{
		return username;
	}
	
	/**
	 * Setter for username
	 * @param username
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	/**
	 * Getter for password
	 * @return
	 */
	public String getPassword()
	{
		return password;
	}
	
	/**
	 * Setter for password
	 * @param password
	 */
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAdmin() {
		return admin;
	}

	public void setAdmin(int admin) {
		this.admin = admin;
	}

	@Override
	public String toString()
	{
		return "LoginModel [username=" + username + ", password=" + password +"]";
	}
}
