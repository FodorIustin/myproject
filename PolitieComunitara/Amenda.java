package PolitieComunitara;

public abstract class Amenda {
		public String CNP;
		public double suma;
		public Amenda(String cnp, double suma) {
			super();
			CNP = CNP;
			this.suma = suma;
		}
		public String getCNP() {
			return CNP;
		}

		public void setcnp(String CNP) {
			CNP = CNP;
		}

		public double getSuma() {
			return suma;
		}

		public void setSuma(double suma) {
			this.suma = suma;
		}

		public abstract double getValoareAmenda();
		@Override
		public String toString() {
			return CNP + " " + this.getClass().getName() + "[" + getValoareAmenda() + "]";
		}
}
