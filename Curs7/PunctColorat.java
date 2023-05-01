package Curs7;

public class PunctColorat extends Punct {
	private int c;

	public PunctColorat(double x, double y, int c) {
		super(x, y);
		this.c = c;
	}
	public PunctColorat(double x , double y) {
		this(x , y , 0);
	}
	public String toString() {
		return "PunctColorat(" + getX() + " ," + getY() + ")cu cod de culoare: " + c;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
}
