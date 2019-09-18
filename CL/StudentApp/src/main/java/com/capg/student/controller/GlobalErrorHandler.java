package com.capg.student.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.capg.student.exceptions.StudentException;

@ControllerAdvice
public class GlobalErrorHandler {
	
	@ExceptionHandler({StudentException.class})
	public ResponseEntity<String> handleError(Exception ex) {
	 return new
				ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler({ MethodArgumentNotValidException.class })
	public ResponseEntity<List<String>> handleValidationErrors(MethodArgumentNotValidException ex) {
    List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
    List<String> errors = new ArrayList<>();
    for (FieldError stringErrors : fieldErrors) {
        errors.add(stringErrors.getDefaultMessage());
    }
    return new ResponseEntity<List<String>>(errors, HttpStatus.NOT_ACCEPTABLE);
	}
}
