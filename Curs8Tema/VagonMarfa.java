package Curs8Tema;

public class VagonMarfa extends Vagon {
    public VagonMarfa(int nrColetePostale) {
        super(nrColetePostale);
    }
    
    public void deschideUsi() {
        System.out.println("Usile se deschid manual");
    }
    
    public void inchideUsi() {
        System.out.println("Usile se inchid manual");
    }
}