package com.javashitang;

import com.javashitang.config.AppConfig;
import com.javashitang.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserDao userDao = context.getBean(UserDao.class);
		String str = userDao.getUser();
		System.out.println(str);
	}
}
