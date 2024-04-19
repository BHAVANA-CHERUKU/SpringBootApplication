package com.infy.bean;

import com.infy.exception.InfytelException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {

    @Autowired
    @Qualifier("prepaid")
    private Plan plan;

    public String register(String planName) throws InfytelException {
        try{
            if(plan.enrollToPlan(planName)) return "Customer enrolled to plan!";
            else throw new InfytelException("Customer not registered");
        }
        catch (InfytelException exception){
            Log LOGGER = LogFactory.getLog(this.getClass());
            LOGGER.error(exception.getMessage(), exception);
            throw exception;
        }
    }
}
