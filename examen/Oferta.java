package examen;

class Oferta extends Act {
    private double valoareTotala;
    private Client client;

    public Oferta(double valoareTotala, Client client) {
        this.setValoareTotala(valoareTotala);
        this.setClient(client);
    }

	public double getValoareTotala() {
		return valoareTotala;
	}

	public void setValoareTotala(double valoareTotala) {
		this.valoareTotala = valoareTotala;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}