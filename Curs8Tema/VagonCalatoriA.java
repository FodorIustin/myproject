package Curs8Tema;

public class VagonCalatoriA extends Vagon {
    private int nrPasageri;
    
    public VagonCalatoriA(int nrPasageri, int nrColetePostale) {
        super(nrColetePostale);
        this.nrPasageri = nrPasageri;
    }
    
    public void deschideUsi() {
        System.out.println("Usile s-au deschis automat");
    }
    
    public void inchideUsi() {
        System.out.println("Usile s-au inchis automat");
    }
}