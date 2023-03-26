package Curs6Tema;

import java.util.LinkedList;

public class Produs {
    private String nume;
    private double pret;

    public Produs(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }
}
public class CosCumparaturi {
    private LinkedList<Produs> listaProduse;

    public CosCumparaturi() {
        listaProduse = new LinkedList<>();
    }

    public void adaugaProdus(Produs produs) {
        listaProduse.add(produs);
    }

    public double calculeazaTotal() {
        double total = 0;
        for (Produs produs : listaProduse) {
            total += produs.getPret();
        }
        return total;
    }
}

