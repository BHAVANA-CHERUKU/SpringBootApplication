package com.infy.controller;

import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfytelException;
import com.infy.service.CustomerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller(value = "customerLoginController")
public class CustomerLoginController {
    @Autowired
    private CustomerLoginService customerLoginService;
    public String authenticateCustomer(CustomerLoginDTO customerLogin) throws InfytelException{
        return customerLoginService.authenticateCustomer(customerLogin);
    }

}
