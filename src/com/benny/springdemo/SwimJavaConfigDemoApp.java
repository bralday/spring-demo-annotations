package com.benny.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config file (via java class this time)
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get bean from container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//call method from bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmail()); //from properties config lesson
		
		System.out.println(theCoach.getTeam());
		
		//close context
		context.close();

	}

}
