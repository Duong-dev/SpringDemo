package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve bean from container
		Coach theCoach = context.getBean("cricketCoach", Coach.class);

		Coach alphaCoach = context.getBean("cricketCoach", Coach.class);

		System.out.println("theCoach:" + theCoach);
		System.out.println("alphaCoach" + alphaCoach);

		context.close();
	}

}
