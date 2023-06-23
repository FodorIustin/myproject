package ConturiBancare;

public class ContEuro extends ContBancar {

	public static final float cursValutar = (float) 4.9;
	public static final float dobanda = (float) 0.4;
	
	public ContEuro(String nrCont) {
		super(nrCont);
		
	}
	@Override
	public float getSumaTotala() {
		// TODO Auto-generated method stub
		return getSuma() + cursValutar;
	}
	@Override
	public String getValuta() {
		// TODO Auto-generated method stub
		return "EURO";
	}
	public float getDobanda(int nrZile) {
		if (getSuma() <= 500)
			return 0;
		return  nrZile * dobanda;
	}
}
