package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	// create a no-args constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-args constructor");
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public CricketCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	// Our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("This is setter");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Training";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.printFortuneMess();
	}

}
