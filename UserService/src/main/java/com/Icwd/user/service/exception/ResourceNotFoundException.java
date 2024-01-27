package com.Icwd.user.service.exception;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException() {
		super("Given resource not found on Server");
	}

	public ResourceNotFoundException(String message) {
		super(message);
	}

}
