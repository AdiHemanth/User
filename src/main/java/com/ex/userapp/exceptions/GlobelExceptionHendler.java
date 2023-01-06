package com.ex.userapp.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ex.userapp.response.Response;

@RestControllerAdvice
public class GlobelExceptionHendler extends RuntimeException{
	@ExceptionHandler
	public Response handelInvalidUserCredentialException(Exception e) {
		Response response=new Response();
		response.setStatus(501);
		response.setMessage(e.getMessage());
		return response;
		
	}
}
