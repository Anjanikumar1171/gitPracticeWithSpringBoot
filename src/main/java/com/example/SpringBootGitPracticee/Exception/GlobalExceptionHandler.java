package com.example.SpringBootGitPracticee.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> GenericException(Exception ex){
		
		return new ResponseEntity<>("Interval Server Erro",
				HttpStatus.INTERNAL_SERVER_ERROR);
		
		
	}
	
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<String> ResourceNotFoundException(ResourceNotFoundException ex){
		
		return new ResponseEntity<>((ex.getMessage()),
				HttpStatus.NOT_FOUND);
		
		
	}
	
	

}
