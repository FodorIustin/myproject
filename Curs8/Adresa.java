package Curs8;

public class Adresa {
	
	private String strada;
	private int nr;
	public Adresa(String strada, int nr) {
		this.strada = strada;
		this.nr = nr;
	}
	public String getStrada() {
		return strada;
	}
	public void setStrada(String strada) {
		this.strada = strada;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	public String toString() {
		return "Strada " + strada + " Nr. " + nr;
	}
	
}
