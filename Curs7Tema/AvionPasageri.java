package Curs7Tema;

public class AvionPasageri extends Avion {
    public int maxPassengers;
    
    public AvionPasageri(String planeID, int totalEnginePower, int maxPassengers) {
        super(planeID, totalEnginePower);
        this.maxPassengers = maxPassengers;
    }
    
    public int getMaxPassengers() {
        return maxPassengers;
    }
}

