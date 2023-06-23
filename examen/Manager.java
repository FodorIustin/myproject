package examen;

import java.util.List;

public class Manager extends Angajat {
	  private List<Muncitor> subordonati;

	    public Manager(String nume, String prenume, int aniVechime) {
	        super(nume, prenume, aniVechime);
	        subordonati = new ArrayList<>();
	    }

	    public void adaugaSubordonat(Muncitor muncitor) {
	        subordonati.add(muncitor);
	    }

	    public void afisareSubordonati() {
	        System.out.println("Subordonați:");
	        for (Muncitor muncitor : subordonati) {
	            System.out.println("- " + muncitor.getNumeComplet());
	        }
	    }

	    @Override
	    public void afisareNumeCompletSiFunctie() {
	        System.out.println("Nume complet: " + super.nume + " " + super.prenume + ", Funcție: Manager");
	    }
	}


}
