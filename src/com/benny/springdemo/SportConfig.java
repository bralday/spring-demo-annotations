package com.benny.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.benny.springdemo") //same as xml just annotation form lol.
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//define bean for sadFortuneService
	@Bean
	public FortuneService sadFortuneService() { //method name is BEAN ID
		return new SadFortuneService();
	}
	
	//define bean for SwimCoach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService()); //call bean method
		
	}
	
}
