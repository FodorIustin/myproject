
public class Complex {
	
	private static int nrAfisari =0;
	private double re,im;
	
	public Complex(double re, double im) {
		this.re =re;
		this.im= im;
	}
	public double modulComplex() {
		double modul=Math.sqrt(re*re+im*im);
		return modul;
	}
	public String afisare() {
		nrAfisari++;
		return re+ " i * "+im;
	}
	
	public static void contorAfisari() {
		System.out.println("S=au afisat " +nrAfisari +"nr complexe ");
	}
	public Complex suma(Complex c) {
		Complex adunare=new Complex(this.re+c.re, this.im+c.im);
		return adunare;
	}
}
