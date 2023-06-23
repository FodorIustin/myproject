package biblioteca;

public abstract class BibliotecaElement implements Imprumutabil {
	
	private static long contorID = 0;
	private long id;
	private String titlu,autor;
	private int nrZile;
	private boolean esteDisponibil;
	public BibliotecaElement(String titlu, String autor, int nrZile) {
		this.titlu = titlu;
		this.autor = autor;
		this.nrZile = nrZile;
		this.id = contorID++;
		this.esteDisponibil = true;
	}
	public String getTitlu() {
		return titlu;
	}
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNrZile() {
		return nrZile;
	}
	public void setNrZile(int nrZile) {
		this.nrZile = nrZile;
	}
	public static long getContorID() {
		return contorID;
	}
	public long getId() {
		return id;
	}
	@Override
	public boolean imprumta() {
		if(esteDisponibil) {
			esteDisponibil = false;
			return true;
		}
		return false;
	}
	@Override
	public void returneaza() {
		esteDisponibil = true;
		
	}
	@Override
	public boolean esteDispobil() {
		return esteDisponibil;
	}
	@Override
	public int getDurataMaximaImprumut() {
		return nrZile;
	}
	
	
	
}
