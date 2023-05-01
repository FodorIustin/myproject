package happyCustomer;

public class Store {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart(50);
		SelfPay station = new SelfPay();
		
		for( int i=1;i<=30;i++) {
			if(i%5==0) 
			{
			Customer customer = new Customer("Client" + i,10,cart);
			station.use(customer);}
			else {
				Customer customer = new Customer("Client" + i,100,cart);
				station.use(customer);
			}
	}

}
}
