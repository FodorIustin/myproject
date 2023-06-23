package GestiuneAngajati;

public abstract class Angajat {
		
		private String nume;
		private double salar;
		public Angajat(String nume, double salar) {
			this.nume = nume;
			this.salar = salar;
		}
		public String getNume() {
			return nume;
		}
		public void setNume(String nume) {
			this.nume = nume;
		}
		public double getSalar() {
			return salar;
		}
		public double setSalar(double salar) {
			return this.salar = salar;
		}
		
		public double calculSalar() {
			return salar;
		}
		
}
