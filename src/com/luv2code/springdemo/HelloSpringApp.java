package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
		Coach baseballCoach2 = context.getBean("baseballCoach2", Coach.class);
		Coach trackCoach = context.getBean("trackCoach", Coach.class);

		FortuneService myFortune = context.getBean("myFortune", FortuneService.class);

		// call methods on the bean
//		System.out.println(baseballCoach.getDailyWorkout());
//		System.out.println(baseballCoach.getDailyFortune());
//
//		System.out.println(baseballCoach2.getDailyWorkout());
		System.out.println(baseballCoach2.getDailyFortune());
//
//		System.out.println(trackCoach.getDailyWorkout());
//		System.out.println(trackCoach.getDailyFortune());

		// let's call our new method for fortunes
		System.out.println(myFortune.getFortune());
		// close the context
		context.close();
	}

}







