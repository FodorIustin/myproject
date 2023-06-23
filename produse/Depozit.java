package produse;

import java.util.TreeSet;

public class Depozit {

	private TreeSet<Produs> listaProduse;

	public Depozit() {
		listaProduse = new TreeSet<Produs>();
	}
	public boolean adaugaProdus(Produs produsNou) {
		boolean semafor = false;

		for(Produs p : listaProduse) {
			if(p.equals(produsNou)) {
				p.setCantitate(p.getCantitate() + produsNou.getCantitate());
				semafor = true;
		}
	}
		if(semafor)
			listaProduse.add(produsNou);
		return semafor;
}
		public void tiparireInventar() {
			System.out.println("Depozitul nostru contine urmatoarele produse: ");
			for(Produs p : listaProduse) {
				System.out.println(p);
			}
		}
	
}
