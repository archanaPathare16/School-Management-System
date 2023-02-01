package com.SPRING;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdditionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdditionApplication.class, args);
	
		Addition addition = new Addition();
	
	    int sum = addition.sum(20, 10);
	    System.out.println("this is the addition of a and b" +sum);
	
	}

}
