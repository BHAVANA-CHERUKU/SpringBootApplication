package com.infy.repository;

import com.infy.dto.CustomerLoginDTO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository(value = "customerLoginRepository")
public class CustomerLoginRepositoryImpl implements CustomerLoginRepository{
    @Override
    public CustomerLoginDTO getCustomerLoginByLoginName(String loginName) {
        Map<String, String> customerCredentials = new HashMap<>();
        customerCredentials.put("bhavana", "bhavana123");
        customerCredentials.put("chandana", "chandana123");
        customerCredentials.put("spandana", "spandana123");

        CustomerLoginDTO customerLogin = new CustomerLoginDTO();
        customerLogin.setLoginName(loginName);
        customerLogin.setPassword(customerCredentials.get(loginName));
        return customerLogin;
    }
}
