package com.infy.bean;

import org.springframework.stereotype.Component;

@Component("prepaid")
public class Prepaid implements Plan{
    @Override
    public Boolean enrollToPlan(String planName) {
        return planName.equalsIgnoreCase("PREPAID");
    }
}
