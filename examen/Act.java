package examen;

public class Act {
    private static int idNou = 1;
    private int id;

    public Act() {
        this.id = idNou;
        idNou++;
    }

    public int getId() {
        return id;
    }
}

