public class Suma {
    public static int suma(int a, int b) {
        return a + b;
    }

    public static int suma(int a, int b, int c) {
        return suma(a, b) + c;
    }

    public static int suma(int a, int b, int c, int d) {
        return suma(a, b, c) + d;
    }

 
    public static void main(String[] args) {
        int a = 2, b = 3, c = 4, d = 5;
        System.out.println("Suma a si b este: " + Suma.suma(a, b));
        System.out.println("Suma a, b si c este: " + Suma.suma(a, b, c));
        System.out.println("Suma a, b, c si d este: " + Suma.suma(a, b, c, d));
    }
}