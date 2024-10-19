package com.LearningManagementSystemGroup.EduGo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EduGoApplication {

	public static void main(String[] args) {
		System.out.println("EduGo start");
		SpringApplication.run(EduGoApplication.class, args);
		System.out.println("EduGo Stop");
	}

}
