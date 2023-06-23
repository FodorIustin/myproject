package examen;

public class Oferta extends Act {
	private double valoareTotala;
    private Client client;

    public Oferta(double valoareTotala, Client client) {
        this.valoareTotala = valoareTotala;
        this.client = client;
    }

}
