package com.javashitang.dependency.field;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FieldMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(FieldConfig.class);
		// com.javashitang.dependency.field.FieldA@3aa9e816
		System.out.println(context.getBean(FieldA.class));
		// com.javashitang.dependency.field.FieldB@17d99928
		System.out.println(context.getBean(FieldB.class));
	}
}
