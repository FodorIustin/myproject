package produse;

public class ProdusCompensat extends Produs {

	private double coeficient;
	
	public ProdusCompensat(String cod, String nume, double pret, double cantitate, double coeficient) {
		throws PretSupraUnitarException{
		super(cod, nume, pret, cantitate);
		try {
			if(coeficent<=0 || coeficient >1)
				throw new PretSupraUnitarException("Produsul " + nume + " a primit un coeficient gresit ("+ coeficient + ")");
			this.coeficient = coeficient;
		}
		catch(PretSupraUnitarException e) {
			System.out.println(e);
		}
	}
	}
	public ProdusCompensat(String cod, String nume, double pret, double cantitate,double coeficient) {
		this(cod, nume, pret,coeficient, 0);
	}
	public double getPret() {
		return super.getPret() * coeficient;
	}
}
