package com.axis.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
//	@ExceptionHandler(IdNotFoundException.class)
//    ResponseEntity<String> myException(IdNotFoundException exception){
//    return new ResponseEntity<String>(exception.getMsg(), HttpStatus.NOT_FOUND);
//	}
//   
//   
//    @ExceptionHandler(InValidAgeException.class)
//	   ResponseEntity<String> myException(InValidAgeException exception1){
//	   return new ResponseEntity<String>(exception1.getMsg(), HttpStatus.NOT_FOUND);
//	      
//   }
//    
//    
//    @ExceptionHandler(InValidSalaryException.class)
//    ResponseEntity<String> myException(InValidSalaryException exception2){
//    	return new ResponseEntity<String>(exception2.getMsg() , HttpStatus.NOT_FOUND);
//    }
	
	@ExceptionHandler(IdNotFoundException.class)
	ResponseEntity<ErrorInfo> myIdException(IdNotFoundException exception)
	{
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorMessage(exception.getMsg());
		errorInfo.setStatus(HttpStatus.NOT_FOUND.toString());
		errorInfo.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(InValidAgeException.class)
	ResponseEntity<ErrorInfo> myAgeException(InValidAgeException exception)
	{
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorMessage(exception.getMsg());
		errorInfo.setStatus(HttpStatus.BAD_REQUEST.toString());
		errorInfo.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(InValidAgeException.class)
	ResponseEntity<ErrorInfo> mySalaryException(InValidAgeException exception){
		
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorMessage(exception.getMsg());
		errorInfo.setStatus(HttpStatus.BAD_REQUEST.toString());
		errorInfo.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.BAD_REQUEST);
	}
}