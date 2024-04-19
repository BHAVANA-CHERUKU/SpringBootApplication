package com.infy.SpringBootInfytelApplication;

import com.infy.bean.Customer;
import com.infy.controller.CustomerLoginController;
import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfytelException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ComponentScan("com.infy")
public class SpringBootInfytelApplication {
//	public static void main(String[] args) {
//		ApplicationContext context =  SpringApplication.run(SpringBootInfytelApplication.class, args);
//		Customer customer = context.getBean(Customer.class);
//		String plan = "PREPAID";
//		Log LOGGER = LogFactory.getLog(SpringBootInfytelApplication.class);
//		try{
//			String msg = customer.register(plan);
//			LOGGER.info(msg);
//		}
//		catch (Exception e){
//			LOGGER.info("Sorry, some exception occurred. Please check log file!");
//		}
//	}

	private static final Log LOGGER = LogFactory.getLog(SpringBootInfytelApplication.class);
	public static void main(String[] args){
		ApplicationContext context = SpringApplication.run(SpringBootInfytelApplication.class, args);
		CustomerLoginController customerLoginController = context.getBean(CustomerLoginController.class);
		Environment environment = context.getEnvironment();
		try{
			CustomerLoginDTO customerLogin = new CustomerLoginDTO();
			customerLogin.setLoginName("bhavana");
			customerLogin.setPassword("bhavana123");
			customerLoginController.authenticateCustomer(customerLogin);
			customerLoginController.authenticateCustomer(customerLogin);
			LOGGER.info(environment.getProperty("SUCCESS"));
		}
		catch (InfytelException exception){
			LOGGER.error(environment.getProperty(exception.getMessage()));
		}
	}
}
