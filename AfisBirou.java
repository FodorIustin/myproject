public class AfisBirou {
    public static void main(String[] args) {
    	Sertar sertar1 = new Sertar(10, 20, 5);
        Sertar sertar2 = new Sertar(10, 20, 5);
        Birou birou = new Birou(100, 60, 80, sertar1, sertar2);
        birou.print();
    }
}