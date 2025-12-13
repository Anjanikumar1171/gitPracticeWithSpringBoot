package com.example.SpringBootGitPracticee.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootGitPracticee.Dao.studentDao;

@Service
public class StudentService { 
	
	@Autowired
	studentDao dao;
	
	//Service function will start from here

}
