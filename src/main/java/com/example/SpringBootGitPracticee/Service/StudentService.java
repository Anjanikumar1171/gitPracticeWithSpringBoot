package com.example.SpringBootGitPracticee.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootGitPracticee.Dao.StudentRepo;
import com.example.SpringBootGitPracticee.Entity.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo repo;

	public Student save(Student info) {
		
		
		Student save = repo.save(info);
		
		return save;

		
	}

	public Optional<Student> getRecord(Long id) {
		
	
		Optional<Student> byId = repo.findById(id);
		
		
		return byId;
	}
	
	
	
}
