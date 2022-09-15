package com.comfortatyourdoorstep.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException{

	private static final long serialVersionUid=1L;
	
	public ResourceNotFound(String message) {
		
		super(message);
	}
}
