package com.example.SpringBootGitPracticee.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.SpringBootGitPracticee.Dao.StudentRepo;
import com.example.SpringBootGitPracticee.Entity.Student;
import com.example.SpringBootGitPracticee.Exception.ResourceNotFoundException;

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

	@Cacheable("students")
	public List<Student> getAll() {
		
		
		List<Student> all=repo.findAll();
		System.out.println(">>>>>>------"+all.toString());

		return all;
	}

	@CachePut(value="Students", key ="#id")
	@CacheEvict(value = "Students", key = "'ALL'")
	public Student update(Long id, Student data) {
		
		Student existing = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
     
		 existing.setStudentName(data.getStudentName());
	        existing.setAddress(data.getAddress());
	        existing.setRoll_no(data.getRoll_no());

		
		return repo.save(existing);
	}
	
	
	
}
