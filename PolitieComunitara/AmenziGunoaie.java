package PolitieComunitara;

public class AmenziGunoaie implements Strategie {

	private FactorZonal factorZonal;
	
	public AmenziGunoaie(FactorZonal factorZonal) {
		this.factorZonal = factorZonal;
	}

	@Override
	public boolean conditie(Amenda amenda) {
		if(amenda instanceof AruncatGunoaie) {
			AruncatGunoaie a = (AruncatGunoaie) amenda;
			if(factorZonal.equals(a.getFactorZonal())) {
				return true;
			}
		}
		return false;
	}

}
