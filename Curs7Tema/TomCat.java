package Curs7Tema;

public class TomCat extends AvionLupta {
    public TomCat(String planeID, int totalEnginePower) {
        super(planeID, totalEnginePower);
    }
    
    public void refuel() {
        System.out.println(planeID + " Value Initiating refueling procedure Locating refueller- Catching up- Refueling Refueling complete");
    }
}
