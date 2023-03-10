public class Carte {
    private int nrPagini;
    
    public Carte(int numarPagini) {
        this.nrPagini = numarPagini;
    }
    
    public int getnrPagini() {
        return nrPagini;
    }
    
    public boolean equals(Carte altaCarte) {
        return this.nrPagini == altaCarte.getnrPagini();
    }
    
    public static void main(String[] args) {
        Carte carte1 = new Carte(50);
        Carte carte2 = new Carte(50);
       
        
        System.out.println("Cele 2 carti sunt identice : " + carte1.equals(carte2));
    }
}