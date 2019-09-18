package org.cg.chn.employee.controller;

import org.cg.chn.employee.exception.EmployeeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalErrorHandler  {

	@ExceptionHandler({EmployeeException.class})
	public ResponseEntity<String> handleError(Exception ex) {
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);
	}
}
