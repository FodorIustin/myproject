package happyCustomer;

public class SelfPay {
	private static int indexStation=0;// nr case
	private int id;
	private int indexCustomer;// nr clienti

	public SelfPay() {
		this.id = indexStation++;
		this.indexCustomer=1;
	}
	public void use(Customer c) {
		if(c.tryBuy()) {
		if(c.tryBuy() && indexCustomer==10) {
			System.out.println("Clientul " +c.getName()+" You are a happy customer");
			indexCustomer=0;
		}
		else indexCustomer++;
	}
	//paragraf 3
}
}