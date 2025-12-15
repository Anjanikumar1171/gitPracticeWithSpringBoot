package com.example.SpringBootGitPracticee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootGitPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGitPracticeApplication.class, args);
	}

}
