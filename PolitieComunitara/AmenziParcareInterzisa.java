package PolitieComunitara;

public class AmenziParcareInterzisa implements Strategie {

	@Override
	public boolean conditie(Amenda amenda) {
		
		if(amenda instanceof ParcareInterzisa)
		return true;
	else
		return false;
	}

}
