package PolitieComunitara;

import java.util.ArrayList;

public class GestiuneAmenzi {
		private ArrayList<Amenda> listaAmenzi;

		public GestiuneAmenzi() {
			listaAmenzi = new ArrayList<Amenda>();
		}
		public boolean adaugaAmenda(Amenda a) {
			return listaAmenzi.add(a);
		}
		public double valoare(Strategie strategie) {
			double valoareTotalaAmenzi = 0;
			for(Amenda a: listaAmenzi) {
					if(strategie.conditie(a)) {
						valoareTotalaAmenzi += a.getValoareAmenda();}
					}
			return valoareTotalaAmenzi;
		}
}
