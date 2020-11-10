package com.example.demo.Advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.MyExceptionalClasses.UserException;
import com.example.demo.model.UserError;

@ControllerAdvice
public class GlobalHandling {
	
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<UserError> mapException(UserException ex)
	{
UserError error=new UserError(HttpStatus.BAD_REQUEST.value(),ex.getMessage());
		return new ResponseEntity<UserError>(error,HttpStatus.BAD_REQUEST);
		
	}
	
	
}
