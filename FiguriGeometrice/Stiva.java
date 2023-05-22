package FiguriGeometrice;

import java.util.LinkedList;

import Stiva.exceptii.ElementDuplicat;
import Stiva.exceptii.StivaNegativa;

public class Stiva {
	
	private int dim;
	private LinkedList<FiguraGeometrica> figuri;
	
	public Stiva(int dim) throws StivaNegativa{
		if(dim <= 0)
			throw new StivaNegativa(dim);
		this.dim = dim;
		figuri = new LinkedList <FiguraGeometrica>();
	}
	public boolean adaugaFigura(FiguraGeometrica fig) throws ElementDuplicat {
		for(FiguraGeometrica f : figuri) {
			if(f.equals(fig))
				throw new ElementDuplicat(fig);	
		}
		figuri.addLast(fig);
	
		figuri.addLast(fig);
		return true;
	}
}

