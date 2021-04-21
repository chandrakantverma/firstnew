package com.besmart.api.healthtip.controller;


import com.besmart.api.healthtip.service.HealthtipServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class healthtipControllerImpl {

    @Autowired
    private HealthtipServiceImpl service;

    @RequestMapping("/learn")
    String home()
    {
        return service.getString();
    }


}
