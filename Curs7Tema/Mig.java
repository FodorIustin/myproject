package Curs7Tema;

public class Mig extends AvionLupta {
    public Mig(String planeID, int totalEnginePower) {
        super(planeID, totalEnginePower);
    }
    
    public void highSpeedGeometry() {
        System.out.println(planeID + " High speed geometry selected");
    }
    
    public void normalGeometry() {
        System.out.println(planeID + " Normal geometry selected");
    }
}
