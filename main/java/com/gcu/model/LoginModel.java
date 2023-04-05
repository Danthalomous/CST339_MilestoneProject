package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginModel
{
	Long id = 0L;
	
	@NotNull(message="Username is a required field")
	@Size(min=1, max=32, message="Username must be between 1 and 32 characters")
	private String username;
	
	@NotNull(message="Password is a required field")
	@Size(min=1, max=32, message="Password must be between 1 and 32 characters")
	private String password;
	
	int admin = 0;
	
	
	
	/**
	 * @param id
	 * @param username
	 * @param password
	 * @param admin
	 */
	public LoginModel(Long id,
			@NotNull(message = "Username is a required field") @Size(min = 1, max = 32, message = "Username must be between 1 and 32 characters") String username,
			@NotNull(message = "Password is a required field") @Size(min = 1, max = 32, message = "Password must be between 1 and 32 characters") String password,
			int admin) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.admin = admin;
	}

	public LoginModel() {
		// TODO Auto-generated constructor stub
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
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the admin
	 */
	public int getAdmin() {
		return admin;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param admin the admin to set
	 */
	public void setAdmin(int admin) {
		this.admin = admin;
	}

	@Override
	public String toString()
	{
		return "LoginModel [username=" + username + ", password=" + password +"]";
	}
}
