package com.infy.service;

import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfytelException;

public interface CustomerLoginService {
    String authenticateCustomer(CustomerLoginDTO customerLogin) throws InfytelException;
}
