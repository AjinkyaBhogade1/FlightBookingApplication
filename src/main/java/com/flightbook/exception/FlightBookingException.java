package com.flightbook.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class FlightBookingException {

	
	
	@ExceptionHandler(InvalidInputException.class)
	public ResponseEntity<ErrorResponse> handleInvalidInputException(InvalidInputException exception,WebRequest request){
		ErrorResponse errorResponse=new ErrorResponse(new Date(), exception.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
	}
	
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> globalExcetion(Exception exception, WebRequest request){
		ErrorResponse errorResponse=new ErrorResponse(new Date(), exception.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
