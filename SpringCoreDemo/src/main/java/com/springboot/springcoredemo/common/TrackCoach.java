package com.springboot.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //Defined the scope to prototype here so now for every dependency injection a new bean instance is created and /scope route must return false.
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In Implementation: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Run 5 sprints 200 meter each!!!";
    }
}
