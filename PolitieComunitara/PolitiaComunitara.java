package PolitieComunitara;

public class PolitiaComunitara {

	public static void main(String[] args) {
		
		Amenda a1 = new ParcareInterzisa("123");
		Amenda a2 = new AruncatGunoaie("123", FactorZonal.II);
		Amenda a3 = new DistrugereBunuri("542", 500);
		Amenda a4 = new ParcareInterzisa("123");
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		GestiuneAmenzi listaAmenzi = new GestiuneAmenzi();
		listaAmenzi.adaugaAmenda(a1);
		listaAmenzi.adaugaAmenda(a2);
		listaAmenzi.adaugaAmenda(a3);
		listaAmenzi.adaugaAmenda(a4);
		
		Strategie amendaCetatean = new AmenziCetatean("123");
		System.out.println(listaAmenzi.valoare(amendaCetatean));
		
		Strategie parcareInterzisa = new AmendaParcareInterzisa();
		System.out.println("Cuantul total amenzii de parcare interzisa: " + listaAmenzi.valoare(parcareInterzisa));
		
		Strategie factorAmenda = new AmenziAruncareGunoaie(FactorZonal.I);
		System.out.println("Este " + listaAmenzi.valoare(factorAmenda));
	}

}
	