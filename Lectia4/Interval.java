package Lectia4;

import java.util.TreeSet;

public class Interval {
	
	private Double min, max;
	private  TreeSet <Double> nrReale;
	private int nrInterne;
	public Interval(Double min, Double max) {
		if(min<max) {
		this.min = min;
		this.max = max;}
		else {
			this.min = max;
			this.max = min;
		}
		this.nrInterne = 0;
		this.nrReale = new TreeSet<Double>();
	}
	public double calculProcentaj() {
		return (double) nrInterne/nrReale.size() * 100;
		
	}
	public void prelucrareNrReale(Double nr) {
		if(nrReale.contains(nr))
			System.out.println("'Numarul'" + nr + "'a fost deja preluat'");
		else {
			nrReale.add(nr);
			if((nr.compareTo(min) >=0) && (nr.compareTo(max)<=0))
				nrInterne++;
		}
	}
	public String toString() {
		return "'Intervalul'" + min + " - " + max + "'inregistreaza un procent de '" + calculProcentaj() ;
	}
	
}
