package examen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Fabrica {
	 private List<Angajat> angajati;
	    private List<Client> clienti;
	    private List<Act> acte;

	    public Fabrica() {
	        angajati = new ArrayList<>();
	        clienti = new ArrayList<>();
	        acte = new ArrayList<>();
	    }

	    public void adaugaAngajat(Angajat angajat) {
	        angajati.add(angajat);
	    }

	    public void concediazaAngajat(Angajat angajat) {
	        angajati.remove(angajat);
	    }

	    public void afisareAngajatiActivi() {
	        System.out.println("Angajați activi:");
	        for (Angajat angajat : angajati) {
	            angajat.afisareNumeCompletSiFunctie();
	        }
	    }

	    public void adaugaClient(Client client) {
	        clienti.add(client);
	    }

	    public void afisareClienti() {
	        System.out.println("Clienți:");
	        for (Client client : clienti) {
	            System.out.println("- " + client.getNume());
	        }
	    }

	    public void generareContract(Client client, double valoareTotala) {
	        Oferta oferta = new Oferta(valoareTotala, client);
	        acte.add(oferta);
	    }

	    public void eliberareFluturasSalar(Angajat angajat, double valoareSalar) {
	        if (angajati.contains(angajat)) {
	            FluturasSalar fluturasSalar = new FluturasSalar(valoareSalar, angajat);
	            acte.add(fluturasSalar);
	        } else {
	            throw new IllegalArgumentException("Angajatul nu mai este activ.");
	        }
	    }

	    public void afisareActeEmise() {
	        System.out.println("Acte emise:");
	        for (Act act : act) {
	            if (act instanceof Oferta) {
	                System.out.println("- Tip: Oferta, ID: " + act.getId() + ", Client: " +
	                        ((Oferta) act).getClient().getNume());
	            } else if (act instanceof FluturasSalar) {
	                System.out.println("- Tip: FluturasSalar, ID: " + act.getId() + ", Angajat: " +
	                        ((FluturasSalar) act).getAngajat().getNumeComplet());
	            }
	        }
	    }
}
