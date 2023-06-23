package Curs9;

import java.util.Random;

public class FootballCoach implements Coach, Psychologyst {
	private String[] listOfAdvices = {"Don't give up",
			"Be consistent" , 
			"You can do it", 
			"More work,less chocolate",
			"Pass the ball to Messi"};
	@Override
	public String getAdvice() {
		Random myRandom = new Random();
		int number = myRandom.nextInt(listOfAdvices.length);
		return listOfAdvices[number];
	}

	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "Run 4 km as fast as you can";
	}
	
}
