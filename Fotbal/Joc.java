package Fotbal;


public class Joc {
    private String Barcelona;
    private String Real;
    private int scorBarcelona;
    private int scorReal;
    private int numarOuturi;
    private int numarCornere;

    public Joc(String Barcelona, Real) {
        this.Barcelona = Barcelona;
        this.Real = Real;
    }

    public void simuleaza() {
        Minge mingea = new Minge(50, 25);

        for (int i = 0; i < 1000; i++) {
            try {
                mingea.suteaza();
                System.out.println(this.Barcelona + " - " + this.Real + ": Mingea se afla la coordonatele (" + mingea.getX() + "," + mingea.getY() + ")");
            } catch (Out e) {
                System.out.println("Out!");
                this.numarOuturi++;
                if (mingea.getY() == 0) {
                    mingea = new Minge(50, 0);
                } else {
                    mingea = new Minge(50, 50);
                }
            } catch (Gol e) {
                System.out.println("Gol!");
                if (mingea.getX() == 0) {
                    this.scorReal++;
                } else {
                    this.scorBarcelona++;
                }
                mingea = new Minge(50, 25);
            } catch (Corner e) {
                System.out.println("Corner!");
                this.numarCornere++;
                if (mingea.getX() == 0 && mingea.getY() < 20) {
                    mingea = new Minge(0, 0);
                } else if (mingea.getX() == 0 && mingea.getY() > 30) {
                    mingea = new Minge(0, 50);
                } else if (mingea.getX() == 100 && mingea.getY() < 20) {
                    mingea = new Minge(100, 0);
                } else {
                    mingea = new Minge(100, 50);
                }
            }
        }
   