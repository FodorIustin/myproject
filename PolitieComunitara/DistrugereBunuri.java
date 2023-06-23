package PolitieComunitara;

public class DistrugereBunuri extends Amenda {

	private double valoareBun;
	
	public DistrugereBunuri(String CNP, double valoareBun) {
		super(CNP);
		this.setSuma(300);
		this.valoareBun = valoareBun;
	}

	public double getValoareBun() {
		return valoareBun;
	}

	public void setValoareBun(double valoareBun) {
		this.valoareBun = valoareBun;
	}

	@Override
	public double getValoareAmenda() {
		return this.getSuma() * valoareBun;
	}

}