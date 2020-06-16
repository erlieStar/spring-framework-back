package com.javashitang.argumentResolver;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("manage")
public class ManageController {


	@RequestMapping("getUserInfo")
	public String getUserInfo(@RequestHeader("Accept") String accept) {
		return accept;
	}


	@RequestMapping("getUserDetail/{userId}")
	public String getUserDetail(@PathVariable String userId) {
		return userId;
	}
}
