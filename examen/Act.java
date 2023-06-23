package examen;

public class Act {
	private static int nextId = 1;
    private int id;

    public Act() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }
}


