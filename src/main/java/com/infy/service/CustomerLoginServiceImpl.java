package com.infy.service;

import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfytelException;
import com.infy.repository.CustomerLoginRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "customerLoginService")
public class CustomerLoginServiceImpl implements CustomerLoginService{
    @Autowired
    private CustomerLoginRepository customerLoginRepository;
    @Override
    public String authenticateCustomer(CustomerLoginDTO customerLogin) throws InfytelException {
        try{
            String toReturn = null;
            CustomerLoginDTO customerLoginFromRepository = customerLoginRepository.getCustomerLoginByLoginName(customerLogin.getLoginName());
            if(customerLogin.getPassword().equals(customerLoginFromRepository.getPassword())) toReturn = "SUCCESS";
            else throw new InfytelException("Service.WRONG_CREDENTIALS");
            return toReturn;
        }
        catch (InfytelException exception){
            Log LOGGER = LogFactory.getLog(this.getClass());
            LOGGER.error(exception.getMessage(), exception);
            throw exception;
        }
    }
}
