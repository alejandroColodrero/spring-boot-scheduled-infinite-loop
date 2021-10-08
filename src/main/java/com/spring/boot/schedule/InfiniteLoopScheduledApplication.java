package com.spring.boot.schedule;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class InfiniteLoopScheduledApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfiniteLoopScheduledApplication.class, args);
	}

    @PostConstruct
    public void launcher() { 
    	System.out.println("Initializing");
    }
	
}
