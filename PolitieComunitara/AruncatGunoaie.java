package PolitieComunitara;

public class AruncatGunoaie extends Amenda {

	private FactorZonal factorZonal;
	
	public void setFactorZonal(FactorZonal factorZonal) {
		this.factorZonal = factorZonal;
	}
	
	public AruncatGunoaie(String CNP, FactorZonal factorZonal) {
		super(CNP);
		this.setSuma(200);
		this.factorZonal = factorZonal;
	}

	public FactorZonal getFactorZonal() {
		return factorZonal;
	}

	@Override
	public double getValoareAmenda() {
		return 200 * factorZonal.getFactorZonal();
	}

}