package com.learning.firstspringapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    
    // Inject properties for coach.name and team.name from application.properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //Expose new endpoint for team info
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return coachName + " is the coach of team " + teamName;
    }
    
    // Expose a simple '/' that returns "Hello World"

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k";
    }
}
