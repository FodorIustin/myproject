package examen;

public class Angajat {
    public String nume;
    public String prenume;
    public int aniVechime;
    

    public Angajat(String nume, String prenume, int aniVechime) {
        this.nume = nume;
        this.prenume = prenume;
        this.aniVechime = aniVechime;
    }

 

    public void afisareSalariu(double valoare) {
        System.out.println("Salariu: " + valoare * aniVechime);
    }

    public void afisareNumeCompletSiFunctie() {
        System.out.println("Nume complet: " + nume + " " + prenume + ", Funcție: Angajat");
    }


}

