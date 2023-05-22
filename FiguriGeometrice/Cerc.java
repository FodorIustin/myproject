package FiguriGeometrice;

public class Cerc extends FiguraGeometrica {
	private double r;

	public Cerc(int x, int y, double r) {
		super(x, y);
		this.r = r;
	}
	public double getR() {
		return r;
	}
	public boolean equals(Cerc c) {
		if(x==c.getX() && y == c.getY() && r == c.getR())
			return true;
		return false;
	}
	public String toString() {
		return "Cerc: (" + getX() + "," + getY() + "): "+ getR();
	}
}
