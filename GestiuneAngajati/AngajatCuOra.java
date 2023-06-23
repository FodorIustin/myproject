package GestiuneAngajati;

public class AngajatCuOra extends Angajat {
		private int ore;
	public AngajatCuOra(String nume, double salar) {
		super(nume, salar);
		this.ore = ore;
	}
	public int getOre() {
		return ore;
	}
	public void setOre(int ore) {
		this.ore = ore;
	}
	private double SalarPeOra() {
		return super.getSalar()/ore;
	}
	public  double adaugaOre(int add) {
		return ore + add;
	}
	public double SchimbaSalarPeOra() {
		return  setSalarOra(salarOra);
		if()
		return ore * SalarPeOra();
	}
	
}
