package biblioteca;

public class Carte extends BibliotecaElement {
	
	private int nrPagini;

	public Carte(String titlu, String autor, int nrZile, int nrPagini) {
		super(titlu, autor, nrZile);
		this.nrPagini = nrPagini;
	}
	
}