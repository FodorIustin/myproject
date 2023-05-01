public class Client {

	public static void main(String[] args) {

		Persoana p1= new Persoana("Ionut",8);
		Persoana p2= new Persoana("Ionut",8);
		
		if(p1.equals(p2))
			System.out.println("Avem aceeasi persoana");
		else
			System.out.println("Nu avem aceeasi persoana");
		
		
	   
	}

}