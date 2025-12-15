package com.example.SpringBootGitPracticee.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootGitPracticee.Entity.Student;
import com.example.SpringBootGitPracticee.Exception.ResourceNotFoundException;
import com.example.SpringBootGitPracticee.Service.StudentService;

@RestController
@RequestMapping("/user")
public class StudentController {
	
	
	@Autowired
	StudentService service;
	
	
	
	//getAll Data
	@GetMapping("/getAllData")
	public ResponseEntity<List<Student>> getAllStudentDetails(){
		
		
		List<Student> all=service.getAll();
		
		return ResponseEntity.ok(all);
		
	}
	
	
	
	//method will start from here okkk
	
	@GetMapping("/getData/{id}")
	public ResponseEntity<Optional<Student>> getRecord(@PathVariable Long id) {
		
		Optional<Student> record=null;
		
		if(id==0) {
			
			throw new ResourceNotFoundException("User not found try differn Id");
		}else {
		
		record=service.getRecord(id);
		}
		
			
		
		return ResponseEntity.ok(record);
		
	}
	
	//Create Student records this method
	
	@PostMapping("/create")
	public ResponseEntity<Student> create(@RequestBody Student info){
		
		System.out.println("working>>>>-------");
		Student saved=service.save(info);
		
		
		return ResponseEntity.ok(saved);
		
	}
	
	


}
