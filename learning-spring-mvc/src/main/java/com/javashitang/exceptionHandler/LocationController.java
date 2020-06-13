package com.javashitang.exceptionHandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("location")
public class LocationController {

	@RequestMapping("getLocationInfo")
	public String index() {
		int sum = 10 / 0;
		return "locationInfo";
	}

	@ExceptionHandler(RuntimeException.class)
	public String processRuntimeException() {
		return "LocationController -> 发生RuntimeException";
	}

	@ExceptionHandler(Exception.class)
	public String processException() {
		return "LocationController -> 发生Exception";
	}
}
