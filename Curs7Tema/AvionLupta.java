package Curs7Tema;

public class AvionLupta extends Avion {
    public AvionLupta(String planeID, int totalEnginePower) {
        super(planeID, totalEnginePower);
    }
    
    public void launchMissile() {
        System.out.println(planeID + " - Initiating missile launch procedure Acquiring target - Launching missile - Breaking away Missile launch complete");
    }
}
