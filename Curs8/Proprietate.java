package Curs8;

public abstract class Proprietate {
	private Adresa adresa;
	private double suprafata;
	public Proprietate(Adresa adresa, double suprafata) {
		super();
		this.adresa = adresa;
		this.suprafata = suprafata;
	}
	public Adresa getAdresa() {
		return adresa;
	}
	public void setAdresa(Adresa adresa) {
		this.adresa = adresa;
	}
	public double getSuprafata() {
		return suprafata;
	}
	public void setSuprafata(double suprafata) {
		this.suprafata = suprafata;
	}
	
	public abstract double getImpozit();
}
