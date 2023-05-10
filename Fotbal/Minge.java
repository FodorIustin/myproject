package Fotbal;


public class Minge {
    protected int x;
    private int y;

    public Minge(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void suteaza() throws Out, Gol, Corner {
        CoordinateGenerator generator = new CoordinateGenerator();
        int newX = generator.generateX();
        int newY = generator.generateY();

        if (newY == 0 || newY == 50) {
            throw new Out();
        } else if ((newX == 0 || newX == 100) && (newY >= 20 && newY <= 30)) {
            throw new Gol();
        } else if ((newX == 0 || newX == 100) && (newY < 20 || newY > 30)) {
            throw new Corner();
        }
        this.x = newX;
        this.y = newY;
    }
}


