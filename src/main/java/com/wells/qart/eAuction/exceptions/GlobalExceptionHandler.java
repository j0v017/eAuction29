package com.wells.qart.eAuction.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.wells.qart.eAuction.model.exception.ExceptionResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(InvalidDataException.class)
	public ResponseEntity<ExceptionResponse> handler(InvalidDataException ex) {
		ExceptionResponse exception = new ExceptionResponse(ex.getMessage(), System.currentTimeMillis(),
				HttpStatus.BAD_REQUEST.value());
		ResponseEntity<ExceptionResponse> response = new ResponseEntity<ExceptionResponse>(exception,
				HttpStatus.BAD_REQUEST);
		return response;
	}

	@ExceptionHandler(CannotDeleteProductException.class)
	public ResponseEntity<ExceptionResponse> handler(CannotDeleteProductException ex) {
		ExceptionResponse exception = new ExceptionResponse(ex.getMessage(), System.currentTimeMillis(),
				HttpStatus.BAD_REQUEST.value());
		ResponseEntity<ExceptionResponse> response = new ResponseEntity<ExceptionResponse>(exception,
				HttpStatus.BAD_REQUEST);
		return response;
	}

	@ExceptionHandler(DuplicateBidException.class)
	public ResponseEntity<ExceptionResponse> handler(DuplicateBidException ex){
		ExceptionResponse exception = new ExceptionResponse(ex.getMessage(), System.currentTimeMillis(),
				HttpStatus.BAD_REQUEST.value());
		ResponseEntity<ExceptionResponse> response = new ResponseEntity<ExceptionResponse>(exception,
				HttpStatus.BAD_REQUEST);
		return response;

	}
}
