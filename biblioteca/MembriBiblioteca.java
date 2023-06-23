package biblioteca;

import java.util.ArrayList;
public class MembriBiblioteca {
	
	private String nume, adresa;
	
	private ArrayList<Imprumutabil> listaElemente;

	public MembriBiblioteca(String nume, String adresa, ArrayList<Imprumutabil> listaElemente) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.listaElemente = new ArrayList<Imprumutabil>();
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public ArrayList<Imprumutabil> getListaElemente() {
		return listaElemente;
	}

	public void setListaElemente(ArrayList<Imprumutabil> listaElemente)throws PreaMulteElementeImprumutate {
		if(listaElemente.size() > 3)
			throw new PreaMulteElementeImprumutate();
		this.listaElemente = listaElemente;
	}
	public boolean imprumutaElemente(BibliotecaElement element) {
		try {
		if(listaElemente.size()==3) 
			throw new PreaMulteElementeImprumutate();
		}
			catch(PreaMulteElementeImprumutate e) {
				System.out.println(e.getMessage());
				return false;
			}
			if(!element.esteDispobil()) {
				System.out.println("Din pacate acest element nu e disponibil!");
				return false;
			}
			element.imprumta();
			listaElemente.add(element);
			return true;
	}
	
}
