package com.gcu.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gcu.business.SecurityServiceInterface;
import com.gcu.model.LoginModel;

public class LoginService implements SecurityServiceInterface
{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public boolean isAuthenticated(LoginModel model) 
	{
		// Create a list of valid usernames and passwords
		// String[][] validLogins = new String[][] {
		// 	{"Bob", "pass"},
		// 	{"Marley", "nothing"},
		// 	{"Hello", "World"},
		// 	{"Frodo", "Baggins"},
		// 	{"Daniel", "letmein"}
		// };
		
		List<LoginModel> validLogins = jdbcTemplate.query("select * from users", new LoginMapper());

		boolean success = false;
		// checking to see if the logins are correct
		for(int i = 0; i < validLogins.size(); i++)
		{
			if(model.getUsername().equals(validLogins.get(i).getUsername()) && model.getPassword().equals(validLogins.get(i).getPassword()))
				success = true;
		}
		
		// Login successful
		if(success)
			return true;
		// Login failed
		else		
			return false;
	}

	public void addNewAccount(LoginModel model){
		jdbcTemplate.update("INSERT INTO `users`(`id`, `username`, `password`, `admin`) values(?,?,?,?)",
		model.getId(),
		model.getUsername(),
		model.getPassword(),
		model.getAdmin());
	}
}