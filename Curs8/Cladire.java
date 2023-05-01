package Curs8;

public class Cladire extends Proprietate {

	public Cladire(Adresa adresa, double suprafata) {
		super(adresa,suprafata);
	}

	@Override
	public double getImpozit() {
		return 5 * getSuprafata();
	}
	public String toString() {
		String output = "\tCladire:\t" + this.getAdresa() + "\n";
		output+= "\t\tSuprafata: " +this.getSuprafata() + "\n";
		output+= "\t\tCostul:  " +this.getImpozit() + "\n\n";
		return output;
		}
}
