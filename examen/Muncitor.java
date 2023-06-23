package examen;

import java.util.ArrayList;
import java.util.List;

public class Muncitor extends Angajat {
	private List<String> responsabilitati;

    public Muncitor(String nume, String prenume, int aniVechime) {
        super(nume, prenume, aniVechime);
        responsabilitati = new ArrayList<>();
    }

    public void adaugaResponsabilitate(String responsabilitate) {
        responsabilitati.add(responsabilitate);
    }

    public void afisareResponsabilitati() {
        System.out.println("Responsabilități:");
        for (String responsabilitate : responsabilitati) {
            System.out.println("- " + responsabilitate);
        }
    }

    @Override
    public void afisareNumeCompletSiFunctie() {
        System.out.println("Nume complet: " + super.nume + " " + super.prenume + ", Funcție: Muncitor");
    }
}
