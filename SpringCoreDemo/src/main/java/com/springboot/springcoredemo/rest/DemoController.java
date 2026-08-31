package com.springboot.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springcoredemo.common.Coach;

@RestController
public class DemoController {

    //Define a private field for the dependency
    private Coach myCoach;

    // Define a constructor for dependency injection. Autowired is optional here because we only have one constructor here. theCoach is a dependency or helper being injected here. 
    // The coach has multiple implementations so we need to specify which to use which is why we are using @Qualifier annotation here which tells java which implementation to use.
    // @Autowired
    // public  DemoController(@Qualifier("trackCoach")Coach theCoach){
    //     myCoach = theCoach;
    // }

    // This is how we can normally create a constructor without having to name the implementation class we need to use because we have already marked it as primary.
    // @Primary can only be used for one implementation class and if multiple are marked as primary then the app will fail.
    @Autowired
    public DemoController(Coach theCoach){
        System.out.println("In Constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }


    // Setter Injection. The above was constructor injection. Traditional method name would be ***setCoach*** but it can be changed (Because of the autowired annotation).
    // @Autowired
    // public void doSomething(Coach theCoach){
    //     myCoach = theCoach;
    // }



    @GetMapping ("/")
    public String greet(){
        return "Hello, this is the homepage";
    }
    
    @GetMapping ("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
