package com.example.SpringBootGitPracticee.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootGitPracticee.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
