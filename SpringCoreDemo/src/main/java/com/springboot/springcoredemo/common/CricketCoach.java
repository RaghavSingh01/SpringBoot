package com.springboot.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component here makes it a Spring bean. Marks it for dependency injection.
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) // This here defines the scope of the bean which defines when the bean is created and how its shared. E.g. singleton creates a single 
// shared bean and prototype creates a new bean instance for every dependency injection. THE DEFAULT scope is singleton so writing this line doesn't really change anything. Just
// specifies what scope is being used.
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In Implementation: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Practice batting daily for 1 hour. Also the bowling too. Need to practice fielding too!!!";
    }


}
