public class Patrat {
	private int a;
    private int l;
    public Patrat() {
        l = 10;
    }
    public Patrat(int l) {
        this.l = l;
    }
    public int calculeazaArie() {
        return a=l* l;
    }
    public void afiseazaPatrat() {
        System.out.println("Patrat: l=" + l + " aria=" + calculeazaArie());
    }
    
    public static void main(String[] args) {
        Patrat p1 = new Patrat(5);
        p1.afiseazaPatrat(); 
    }
}