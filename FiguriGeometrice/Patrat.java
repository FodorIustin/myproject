package FiguriGeometrice;

public class Patrat extends FiguraGeometrica {
	
	private double a; 
	private int xP, yP;
	public Patrat(int x, int y, int xP, int yP, double a) {
		super(x, y);
		this.a = a;
		this.xP = xP;
		this.yP = yP;
	}
	public double getA() {
		return a;
	}
	
	public int getxP() {
		return xP;
	}
	public int getyP() {
		return yP;
	}
	public boolean equals(Patrat p) {
		if(a == p.getA())
			return true;
		return false;
	}
	public String toString() {
		return "Cerc: (" + getX() + "," + getY() + "): "+ "latura: "+ (getY() - getyP()) + (getX() - getxP()) ;
	}
}
