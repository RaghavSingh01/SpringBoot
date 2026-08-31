package com.springboot.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
        return "Spend 30 minutes in batting practice!!!";
    }
}   
