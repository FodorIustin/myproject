import java.util.Scanner;

public class p8 {

        // functia de pornire a programului FirstDemo.
        // @param args argumentele de intrare ale pgrogramului

        public static void main(String[] args) {

                Scanner input = new Scanner(System.in); // System.in este tastatura
                int n = input.nextInt(); // introducerea unui numar intreg de la tastatura
               int m=1;
               for(int i=1 ;i<=n;i++) {
            	   m=m*i;
               }
            	   System.out.println(m);
        }
        }
