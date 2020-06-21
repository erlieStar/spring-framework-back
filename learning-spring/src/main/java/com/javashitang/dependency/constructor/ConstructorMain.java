package com.javashitang.dependency.constructor;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConstructorMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ConstructorConfig.class);
		// com.javashitang.dependency.constructor.ConstructorA@c818063
		System.out.println(context.getBean(ConstructorA.class));
		// com.javashitang.dependency.constructor.ConstructorB@3f0ee7cb
		System.out.println(context.getBean(ConstructorB.class));
	}
}
