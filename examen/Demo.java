package examen;

public class Demo {

	public static void main(String[] args) {
	     Fabrica fabrica = new Fabrica();

	        Angajat angajat1 = new Angajat("Timotei", "Pripon", 3);
	        Muncitor muncitor1 = new Muncitor("Fodor", "Iustin", 2);
	        muncitor1.adaugaResponsabilitate("Curatenie");
	        Manager manager = new Manager("Sebastian", "Neagu", 8);
	        manager.adaugaSubordonat(muncitor1);
	        fabrica.adaugaAngajat(angajat1);
	        fabrica.adaugaAngajat(manager);
	        fabrica.afisareAngajatiActivi();

	        Client client1 = new Client("Fortech");

	        fabrica.adaugaClient(client1);
	        fabrica.afisareClienti();
	        fabrica.generareContract(client1, 5000.0);

	        
	}
}

