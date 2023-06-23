package PolitieComunitara;

public enum FactorZonal {
		I(1), II(2), III(3), IV(4);
	private int factorZonal;
	
	private FactorZonal(int factorZonal) {
		this.factorZonal = factorZonal;
	}
	public int getFactorZonal() {
	return factorZonal;
	}
}
