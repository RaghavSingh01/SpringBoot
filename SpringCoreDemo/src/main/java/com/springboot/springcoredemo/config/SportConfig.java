package com.springboot.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.springcoredemo.common.Coach;
import com.springboot.springcoredemo.common.SwimCoach;

// We are using @Configuration and @Bean annotations as an alternate to @Component annotation. These annotations help us make the swimCoach a bean to be used anywhere in the spring project.

@Configuration
public class SportConfig {

    // We can also give a custom bean id by writing it in brackets just like this.
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
