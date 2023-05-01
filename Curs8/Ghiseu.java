package Curs8;

public class Ghiseu {

	public static void main(String[] args) {
	
		Adresa a1 = new Adresa("V. Parvan",2);
		Proprietate p1 = new Cladire(a1, 20);
		Proprietate p2 = new Teren(a1, 10, Rang.I);
		
		Adresa a2 = new Adresa("Lugoj",4);
		Proprietate p3 = new Cladire(a2, 25);
		Contribuabil c = new Contribuabil("Ion Popescu");
		c.addProprietate(p1);
		c.addProprietate(p3);
		c.addProprietate(p2);
		
		System.out.println(c.afisareFluturas());
	}

}
