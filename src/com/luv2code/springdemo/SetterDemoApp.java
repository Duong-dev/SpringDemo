package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// Load a spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve bean from spring container
		CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

		// Call method on bean
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getTeam());
		System.out.println(cricketCoach.getEmailAddress());
		// close the context
		context.close();
	}

}
