package GestiuneAngajati;

import java.util.ArrayList;

public class Firma {
    private List<Angajat> angajati;

    public Firma() {
        Angajat = new ArrayList<>();
    }

    public void angajeaza(Angajat angajat) {
        if (!angajati.contains(angajat)) {
            angajati.add(angajat);
            System.out.println("Angajatul " + angajat.getNume() + " a fost adaugat cu succes.");
        } else {
            System.out.println("Angajatul " + angajat.getNume() + " exista deja in firma.");
        }
    }
}



