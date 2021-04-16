package com.tcs.inetrn21.ms.customermanagement.exception;

public class UserNotFoundException extends RuntimeException{
	
	public UserNotFoundException(String message)
	{
		super(message); 
	}
}
