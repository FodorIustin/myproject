package Curs8Tema;

public class VagonCalatoriB extends Vagon {
    private int nrPasageri;
    
    public VagonCalatoriB(int nrPasageri, int nrColetePostale) {
        super(nrColetePostale);
        this.nrPasageri = nrPasageri;
    }
    
    public void deschideUsi() {
        System.out.println("Usile s-au deschis automat");
    }
    
    public void inchideUsi() {
        System.out.println("Usile s-au inchis automat");
    }
    public void blocheazaGeamuri() {
        System.out.println("Geamurile s-au blocat automat");
    }
}