package com.example.writtingtools.exception;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.writtingtools.controller.PenController;

@RestControllerAdvice
public class GlobalException {
	static Logger log = Logger.getLogger(PenController.class);
	@ExceptionHandler(InkLevelPercentageException.class)
	public ResponseEntity re(InkLevelPercentageException e) {
		PropertyConfigurator.configure("pen.properties");
		log.warn(e.getMessage());
		return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
	}

}
