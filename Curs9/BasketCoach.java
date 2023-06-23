package Curs9;

import java.util.Random;

public class BasketCoach implements Coach, Psychologyst {
	private int index =0;
	private String[] requirements = {"Come on",
			"Score a 3" , 
			"Train hard"};

	@Override
	public String getAdvice() {
		return "Dont worry";
	}

	@Override
	public String getDailyworkout() {
		if(index == requirements.length)
			index = 0;
		return requirements[index++] ;
	}
	
	
}
