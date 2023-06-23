package produse;

public class DepozitDemo {

	public static void main(String[] args) {
		Depozit depozit = new Depozit();
		Produs p1 = new ProdusNecompensat("p1", "Aspirina",10, 0);
		Produs p2 = new ProdusCompensat("p1", "Paracetamol",20, 5, 0.5);
		
		depozit.adaugaProdus(p1);
		depozit.adaugaProdus(p2);
		
	}
		
}
