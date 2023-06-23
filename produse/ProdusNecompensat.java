package produse;

public class ProdusNecompensat extends Produs {

	public ProdusNecompensat(String cod, String nume, double pret, double cantitate) {
		super(cod, nume, pret, cantitate);
	}
	public ProdusNecompensat(String cod, String nume, double pret, double cantitate) {
		super(cod, nume, pret);
	}
}
