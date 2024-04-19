package com.infy.bean;

import org.springframework.stereotype.Component;

@Component("postpaid")
public class Postpaid implements Plan{
    @Override
    public Boolean enrollToPlan(String planName) {
        return planName.equalsIgnoreCase("POSTPAID");
    }
}
