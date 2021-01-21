package com.example.demo.aspect;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.exception.ErrorResponse;

@ControllerAdvice
public class FilmControllerAdvice {

	@ExceptionHandler(DuplicateKeyException.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.CONFLICT)
	public ErrorResponse handleSQLException(DuplicateKeyException ex) {
		return new ErrorResponse("database","Exception occured in DB action");
	}
}
