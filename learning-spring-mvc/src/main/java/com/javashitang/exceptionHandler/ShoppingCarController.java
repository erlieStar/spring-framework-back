package com.javashitang.exceptionHandler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shoppingCar")
public class ShoppingCarController {

	@RequestMapping("getCarInfo")
	public String index() {
		int sum = 10 / 0;
		return "userInfo";
	}
}
