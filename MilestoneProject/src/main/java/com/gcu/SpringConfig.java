package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import com.gcu.business.OrdersBusinessService;
import com.gcu.business.SecurityServiceInterface;
import com.gcu.business.FiveValidLogins;

@Configuration
public class SpringConfig
{
	@Bean(name="securityService")
	SecurityServiceInterface getSecurityService()
	{	
		return new FiveValidLogins();
	}
}

