package com.springboot.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
	For this i moved coach interface and its implementing class cricketCoach from common folder in this package to a seperate package named utils thats why i had to tell springboot 
	to scan that package too because by default it ignores that package. Without this explicit mention of scanning different packages we would need to keep everything in the same package.
@SpringBootApplication(
	scanBasePackages= {"com.springboot.springcoredemo",
						"com.springboot.util"}
)*/
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
