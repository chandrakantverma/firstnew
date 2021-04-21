package com.besmart.api.healthtip.service;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HealthtipServiceImpl implements HealthtipService{

    @Override
    public String getString(){
        return "Hello";
    }


}
