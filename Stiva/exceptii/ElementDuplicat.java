package Stiva.exceptii;

import FiguriGeometrice.FiguraGeometrica;

public class ElementDuplicat extends Exception {
	
	private FiguraGeometrica figuraDuplicata;
	public ElementDuplicat(FiguraGeometrica figuraDuplicata) {
		super("Elementul: " + figuraDuplicata + " este deja stocata.");
		this.figuraDuplicata = figuraDuplicata;
		
	}
}
