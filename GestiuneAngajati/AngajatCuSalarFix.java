package GestiuneAngajati;

public class AngajatCuSalarFix extends Angajat {

	public AngajatCuSalarFix(String nume, double salar) {
		super(nume, salar);
	}
	public double schimbaSalarFix() {
			return super.setSalar(getSalar());
	}
}
