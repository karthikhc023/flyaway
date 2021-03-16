package com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages={
		"com.model", "com.service", "com.controller"})
public class MainAppLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println("inside main function");
		SpringApplication.run(MainAppLaunch.class, args);
	}

}
