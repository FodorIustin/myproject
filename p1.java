import java.util.Scanner;

public class p1 {

        // functia de pornire a programului FirstDemo.
        // @param args argumentele de intrare ale pgrogramului

        public static void main(String[] args) {

                Scanner input = new Scanner(System.in); // System.in este tastatura
                int i = input.nextInt(); // introducerea unui numar intreg de la tastatura

               if(i>5 && i<10) 
            	   System.out.println("ADMIS");
               if(i<5 && i>1) 
            	   System.out.println("RESPINS");
               if(i<1 || i>10) 
            	   System.out.println("INVALID");
               
        }
}
