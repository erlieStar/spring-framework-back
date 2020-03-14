package com.javashitang;

import com.javashitang.config.AppConfig;
import com.javashitang.dao.Dao;
import com.javashitang.dao.IndexDao;
import com.javashitang.dao.IndexDao3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		// 初始化spring环境
		context.refresh();
//		IndexDao indexDao = context.getBean(IndexDao.class);
//		String str = indexDao.getUser();
//		System.out.println(str);
//		IndexDao indexDao1 = context.getBean(IndexDao.class);
//		System.out.println(indexDao.hashCode() + " " + indexDao1.hashCode());
//		context.getBean(IndexDao3.class).query();

		Dao dao = (Dao) context.getBean("indexDao");
		dao.query();
		context.close();
	}
}
