package com.springboot.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//This is the normal implementation and can be used when using @Qualifier annotation in the controller to use this in a constructor.
// @Component
// public class FootballCoach implements Coach {
//     @Override
//     public String getDailyWorkout(){
//         return "Practice power shots!!! & Then finesse shots!!!";
//     }
// }


// This is the approach where we use @Primary annotation so we dont have to use the @Qualifier annotation. With this we can directly call this class in constructor and java  will know which implementaion to use.
@Component
@Primary
public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
        return "Practice power shots!!! & Then finesse shots!!!";
    }
}
