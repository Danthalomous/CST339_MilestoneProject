package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import com.gcu.business.OrdersBusinessService;
import com.gcu.business.SecurityServiceInterface;
import com.gcu.business.LoginService;
import com.gcu.business.ProductBusinessService;
import com.gcu.business.ProductBusinessServiceInterface;

@Configuration
public class SpringConfig
{
	@Bean(name="productBusinessService")
	ProductBusinessServiceInterface getProductService()
	{
		return new ProductBusinessService();
	}
	
	@Bean(name="securityService")
	SecurityServiceInterface getSecurityService()
	{	
		return new LoginService();
	}
}

