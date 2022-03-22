package com.benny.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");		
		
		// retrieve bean
		Coach theCoach = context.getBean("funnyTennisCoach", Coach.class);
		

		Coach alphaCoach = context.getBean("funnyTennisCoach", Coach.class);
		
		//will be false because I set the TennisCoach as @Qualifier (value = "prototype")
		System.out.println("Both objects are the same: " + (theCoach == alphaCoach));
		
		context.close();
	}

}
