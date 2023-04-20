package Curs8Tema;

public abstract class Vagon {
    protected int nrColetePostale;
    
    public Vagon(int nrColetePostale) {
        this.nrColetePostale = nrColetePostale;
    }
    
    public abstract void deschideUsi();
    public abstract void inchideUsi();
}