package ConturiBancare;

public class ContLei extends ContBancar {

	public ContLei(String nrCont) {
		super(nrCont);
	}

	@Override
	public float getSumaTotala() {
		return this.getSuma();
	}

	@Override
	public String getValuta() {
		return "LEI";
	}
	
	
	public boolean transfer(ContLei contDestinatie, float suma) {
		
		if(!this.scadeSuma(suma))
			return false;
		contDestinatie.adaugaSuma(suma);
			return true;
	}
	

}