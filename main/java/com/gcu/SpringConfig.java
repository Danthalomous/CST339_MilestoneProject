package com.gcu;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

//import com.gcu.business.OrdersBusinessService;
import com.gcu.business.SecurityServiceInterface;
import com.gcu.data.LoginService;
import com.gcu.data.ProductDataAccessService;
import com.gcu.data.ProductsDataAccessInterface;
import com.gcu.model.ProductModel;
import com.gcu.business.ProductBusinessService;
import com.gcu.business.ProductBusinessServiceInterface;

@Configuration
public class SpringConfig
{
	@Bean(name="productBusinessService")
	@RequestScope
	ProductBusinessServiceInterface getProductService()
	{
		return new ProductBusinessService();
	}
	
	@Bean(name="securityService")
	SecurityServiceInterface getSecurityService()
	{	
		return new LoginService();
	}
	
	@Autowired
	private DataSource dataSource;
	
	@Bean(name="productsDAO")
	@RequestScope
	ProductsDataAccessInterface<ProductModel> getDataService()
	{
		return new ProductDataAccessService(dataSource);
	}
}

