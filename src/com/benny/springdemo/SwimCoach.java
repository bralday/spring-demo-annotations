package com.benny.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}") //field level injection, from properties file
	private String email;
	
	@Value("${foo.team}")
	private String team;
	

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public SwimCoach(FortuneService fortuneService) { //see SportCOnfig
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Just keep swimming!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
