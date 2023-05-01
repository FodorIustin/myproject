package Curs8;

import java.util.ArrayList;

public class Contribuabil {
	
	private String nume;
	private ArrayList<Proprietate> proprietati;
	
	public Contribuabil(String nume) {
		super();
		this.nume = nume;
		this.proprietati = new ArrayList<Proprietate> ();
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	public void addProprietate(Proprietate p) {
		proprietati.add(p);
	}
	public void removeProprietate(Proprietate p) {
		proprietati.remove(p);
	}
	public double getImpozitTotal() {
		double ImpozitTotal = 0;
		for (Proprietate p: proprietati)
			ImpozitTotal += p.getImpozit();
		return ImpozitTotal;
	}
	public String afisareFluturas() {
		String fluturas = "Contribuabil: "+ nume + "\n\n";
		fluturas+= "Proprietate\n";
		for (Proprietate p: proprietati)
			fluturas+=p;
		
		fluturas += "Suma totala: " + this.getImpozitTotal();
		return fluturas;
	}
}
