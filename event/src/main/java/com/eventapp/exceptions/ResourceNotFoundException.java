package com.eventapp.exceptions;




public class ResourceNotFoundException extends RuntimeException{
	
	

	
	private static final long serialVersionUID = 3772239042752565266L;

	public ResourceNotFoundException(String message) {
		super(message);
	}

}

