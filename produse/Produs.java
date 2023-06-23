package produse;

public abstract class Produs {
	
	private String cod,nume;
	private double pret, cantitate;
	
	public Produs(String cod, String nume, double pret, double cantitate) {
		this.cod = cod;
		this.nume = nume;
		this.pret = pret;
		this.cantitate = cantitate;
	}
	
	public Produs(String cod, String nume, double pret) {
		this(cod, nume, pret, 0);
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	public double getCantitate() {
		return cantitate;
	}

	public void setCantitate(double cantitate) {
		this.cantitate = cantitate;
	}

	@Override
	public String toString() {
		return nume + "[" + cod + "]:" + pret + " [Q: " + cantitate + "]";
	}
	public boolean equals(Produs p) {
		if (p.cod.equals(this.cod))
			return true;
		return false;
	}
}
