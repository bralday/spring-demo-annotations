package com.benny.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("funnyTennisCoach") //default name will be classname but starting with lowercase if no explicit bean id
//@Scope(value = "prototype")
public class TennisCoach implements Coach {
	
	//public TennisCoach() {
	//	System.out.println("Inside TennisCoach default constructor.");
	//} THIS WILL DISPLAY EVEN IF DIFFERENT COACH BECAUSE OF @COMPONENTSCAN
	
	/*@PostConstruct 
	public String doStartUp() {
		return "Coach is warming-up";
	}*/
	
	/*@PreDestroy 
	public String doCleanUp() {
		return "Coach is on cooldown.";
	}*/
	
	
	@Autowired //field injection
	@Qualifier("randomFortuneService") //specify explicit bean ID so spring can identify which one to use if multiple components exists
	private FortuneService fortuneService;
	
	
	/* @Autowired //constructor injection
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	} */

	
	/* @Autowired //setter injection
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	} */


	public String getDailyWorkout() {
		return "Tennis Coach: Hit the ball bish.";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
