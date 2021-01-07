package com.luv2code.springdemo;

public class BasketballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BasketballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Make 105 three pointers in a row";
	}

	@Override
	public String getDailyFortune() {
		return "Basketball luck: " + fortuneService.getFortune();
	}
	
}
