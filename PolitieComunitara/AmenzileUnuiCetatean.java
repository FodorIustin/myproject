package PolitieComunitara;

public class AmenzileUnuiCetatean implements Strategie {
		private String cnp;
		
		public AmenzileUnuiCetatean(String cnp) {
			this.cnp = cnp;
		}
	@Override
	public boolean conditie(Amenda amenda) {
		if(cnp.equals(amenda.getcnp()))
			return true;
		else
		return false;
	}

}
