package Curs8;

public class Teren extends Proprietate {

		private Rang rang;

		public Teren(Adresa adresa, double suprafata, Rang rang) {
			super(adresa, suprafata);
			this.rang = rang;
			
		}

		public Rang getRang() {
			return rang;
		}

		public void setRang(Rang rang) {
			this.rang = rang;
		}

		@Override
		public double getImpozit() {
			return 3.5 * this.getSuprafata() / this.getRang().getValoareRang();
		}
		public String toString() {
			String output = "\tTeren:\t" + this.getAdresa() + "\n";
			output+= "\t\tSuprafata: " +this.getSuprafata() +", Rang: " +this.getRang().getValoareRang()+ "\n";
			output+= "\t\tCostul:  " +this.getImpozit() + "\n\n";
			return output;
			}
	
}