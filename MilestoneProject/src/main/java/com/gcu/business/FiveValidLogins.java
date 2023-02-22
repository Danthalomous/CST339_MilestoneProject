package com.gcu.business;

import com.gcu.model.LoginModel;

public class FiveValidLogins implements SecurityServiceInterface
{

	@Override
	public boolean isAuthenticated(LoginModel model) 
	{
		// Create a list of valid usernames and passwords
		String[][] validLogins = new String[][] {
			{"Bob", "pass"},
			{"Marley", "nothing"},
			{"Hello", "World"},
			{"Frodo", "Baggins"},
			{"Daniel", "letmein"}
		};
		
		boolean success = false;
		// checking to see if the logins are correct
		for(int i = 0; i < validLogins.length; i++)
		{
			if(model.getUsername().equals(validLogins[i][0]) && model.getPassword().equals(validLogins[i][1]))
				success = true;
		}
		
		// Login successful
		if(success)
			return true;
		// Login failed
		else		
			return false;
	}

}
