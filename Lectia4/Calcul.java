package Lectia4;

public class Calcul {

	public static void main(String[] args) {
		Interval it1 = new Interval(1.0,5.0);
		Interval it2 = new Interval(3.0,7.0);
		Interval it3 = new Interval(5.0,10.0);
		
		
		
		Double[] nrReale = {0.5 , 3.2 , 3.2 , 4.3, 8.4};
		for(Double nr : nrReale) {
			it1.prelucrareNrReale(nr);
			it2.prelucrareNrReale(nr);
			it3.prelucrareNrReale(nr);
		}
		System.out.println(it1);
		System.out.println(it2);
		System.out.println(it3);
	}

}
