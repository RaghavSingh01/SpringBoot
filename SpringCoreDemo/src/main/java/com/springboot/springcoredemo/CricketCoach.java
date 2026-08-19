package com.springboot.springcoredemo;

import org.springframework.stereotype.Component;

// @Component here makes it a Spring bean. Marks it for dependency injection.
@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Practice batting daily for 1 hour. Also the bowling too.";
    }


}
