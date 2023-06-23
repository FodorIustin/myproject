package Curs9;

public class Testing {

	public static void main(String[] args) {
		
		FootballCoach fc = new FootballCoach();
		
		System.out.println("Football Advice " +fc.getAdvice());
		System.out.println("Football workout " +fc.getDailyworkout());
		
		TennisCoach tc = new TennisCoach();
		System.out.println("Tennis workout" + tc.getDailyworkout());
		
		BasketCoach bc = new BasketCoach();
		System.out.println("Basket workout" + bc.getDailyworkout());
		System.out.println("Basket workout" + bc.getDailyworkout());
		System.out.println("Basket workout" + bc.getDailyworkout());
		System.out.println("Basket workout" + bc.getDailyworkout());
	}

}
