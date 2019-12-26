package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "This one is in TrackCoach";
	}

	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: first");
	}

	// add a destroy method
	public void doMyStartupStuffYoYo() {
		System.out.println("TrackCoach: second");
	}
}










