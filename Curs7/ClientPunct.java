package Curs7;

public class ClientPunct {

	public static void main(String[] args) {
		Punct p1 = new PunctColorat(0,0,16);
		System.out.println(p1);
		if(p1 instanceof PunctColorat)
			System.out.println("Da este punct colorat");
		
		PunctColorat p2 = (PunctColorat) p1;
		System.out.println("Culoarea punctului este: " + p2.getC());
	}

}
