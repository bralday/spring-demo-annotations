package com.benny.springdemo;

import org.springframework.stereotype.Component;

//@Component
public class SadFortuneService implements FortuneService {

	public String getFortune() {
		return "Today is not the day";
	}

}
