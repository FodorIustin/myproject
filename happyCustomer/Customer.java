package happyCustomer;

public class Customer {
	private String name;
	private float money;
	private ShoppingCart cart;
	
	public Customer(String name, float money, ShoppingCart cart) {
		super();
		this.name = name;
		this.money = money;
		this.cart = cart;
	}
	public boolean tryBuy() {
		if(money >= cart.getValue()) {
		money-= cart.getValue();
		return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Customer " + name + " has an amount of $" + money + " and his shopping cart value is:" + cart.getValue();
	}
	//paragraf 2
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public ShoppingCart getCart() {
		return cart;
	}
	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}
	
	
	
}



