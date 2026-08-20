package com.springboot.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springcoredemo.common.Coach;

@RestController
public class DemoController {

    //Define a private field for the dependency
    private Coach myCoach;

    //Define a constructor for dependency injection. Autowired is optional here because we only have one constructor here. theCoach is a dependency or helper being injected here.
    @Autowired
    public  DemoController(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping ("/")
    public String greet(){
        return "Hello, this is the homepage";
    }
    
    @GetMapping ("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
