package com.dj.microservice.limitsservice.controller;


import com.dj.microservice.limitsservice.configuration.Configuration;
import com.dj.microservice.limitsservice.model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    Configuration configuration;

    @GetMapping
    public Limits getLimits(){
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
        //return new Limits(10,100);
    }
}
