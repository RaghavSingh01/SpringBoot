package com.springboot.springcoredemo.common;

import org.springframework.stereotype.Component;

// @Component here makes it a Spring bean. Marks it for dependency injection.
@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        System.out.println("In Implementation: " + getClass().getSimpleName());
        return "Practice batting daily for 1 hour. Also the bowling too. Need to practice fielding too!!!";
    }


}
