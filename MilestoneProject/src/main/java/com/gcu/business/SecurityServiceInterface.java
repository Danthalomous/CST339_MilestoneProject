package com.gcu.business;

import com.gcu.model.LoginModel;

public interface SecurityServiceInterface
{
	boolean isAuthenticated(LoginModel model);
	void addNewAccount(LoginModel model);
}
