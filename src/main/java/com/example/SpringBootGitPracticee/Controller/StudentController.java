package com.example.SpringBootGitPracticee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootGitPracticee.Exception.ResourceNotFoundException;
import com.example.SpringBootGitPracticee.Service.StudentService;

@RestController
@RequestMapping("/user")
public class StudentController {
	
	
	@Autowired
	StudentService service;
	
	//method will start from here okkk
	
	@GetMapping("/getData/{id}")
	public String getRecord(@PathVariable int id) {
		
		System.out.println("hitted>>>>>>-------");
		
		if(id==0) {
			
			throw new ResourceNotFoundException("User not found");
			
			
		}
		
		
		return "user found";
		
	}
	

}
