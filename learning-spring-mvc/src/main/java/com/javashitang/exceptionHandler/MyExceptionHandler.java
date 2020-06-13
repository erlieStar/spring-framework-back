package com.javashitang.exceptionHandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	public String processRuntimeException() {
		return "MyExceptionHandler -> 发生RuntimeException";
	}

	@ExceptionHandler(Exception.class)
	public String processException() {
		return "MyExceptionHandler -> 发生Exception";
	}
}
