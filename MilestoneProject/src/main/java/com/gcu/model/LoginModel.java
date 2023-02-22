package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginModel
{
	@NotNull(message="Username is a required field")
	@Size(min=1, max=32, message="Username must be between 1 and 32 characters")
	private String username;
	
	@NotNull(message="Password is a required field")
	@Size(min=1, max=32, message="Password must be between 1 and 32 characters")
	private String password;
	
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
	
	@Override
	public String toString()
	{
		return "LoginModel [username=" + username + ", password=" + password +"]";
	}
}
