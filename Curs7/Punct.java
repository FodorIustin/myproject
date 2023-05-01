package Curs7;

public class Punct {
	 private double x,y;

	public Punct(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	 public String toString() {
		 return "Punct(" + x + "," + y + ")" ;
	 }
}
	