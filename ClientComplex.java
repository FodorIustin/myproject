
public class ClientComplex {

	public static void main(String[] args) {
		
		Complex.contorAfisari();
		Complex nrComplex= new Complex(7,23);
		System.out.println(nrComplex.afisare());
		System.out.println("Modulul acestui nr este: "+ nrComplex.modulComplex());
		
		Complex nrNou=new Complex(1,2);
		Complex suma = nrComplex.suma(nrNou);
		System.out.println("Suma nr complexe: "+ suma.afisare());
		
		Complex.contorAfisari();
	}

}
