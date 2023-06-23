package PolitieComunitara;

public class ParcareInterzisa extends Amenda {

	public ParcareInterzisa(String CNP) {
		super(CNP);
		this.setSuma(500);
	}

	@Override
	public double getValoareAmenda() {
		return getSuma();
				
	}
		
}
