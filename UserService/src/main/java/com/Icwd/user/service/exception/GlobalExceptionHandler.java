package com.Icwd.user.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.Icwd.user.service.payload.APIResponse;
import com.Icwd.user.service.payload.APIResponse.APIResponseBuilder;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<APIResponse> handlerResourceNotFoundException(ResourceNotFoundException exception){
		
		String message = exception.getMessage();
		APIResponse response = APIResponse.builder().message(message).success(true).httpStatus(HttpStatus.NOT_FOUND).build();
		
		return new ResponseEntity<APIResponse> (response, HttpStatus.NOT_FOUND);

	}

}
