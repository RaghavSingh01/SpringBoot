package com.springboot.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
// @Lazy   // Can be used in case we only need one class to be lazy
public class BaseballCoach implements Coach {

    public BaseballCoach(){
        System.out.println("In Implementation: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        
        return "Spend 30 minutes in batting practice!!!";
    }
}   
