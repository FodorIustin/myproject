package ConturiBancare;

public abstract class ContBancar implements SumaTotala {
	private String nrCont;
	private float suma;
	
	public ContBancar(String nrCont) {
		this.nrCont = nrCont;
		this.suma = 0;
	}

	public String getNrCont() {
		return nrCont;
	}

	public void setNrCont(String nrCont) {
		this.nrCont = nrCont;
	}

	public float getSuma() {
		return suma;
	}

	public void setSuma(float suma) {
		this.suma = suma;
	}
	
	public void adaugaSuma(float suma) {
		this.suma += suma;
	}
	public boolean scadeSuma(float suma) {
		if(suma > this.suma) {
			System.out.println("Fonduri insuficiente!");
			return false;
		}
		this.suma -=suma;
			return true;
	}
	public abstract String getValuta();
	public String toString() {
		return String.valueOf(suma) + " " + getValuta();
	}

	
	
		
}
