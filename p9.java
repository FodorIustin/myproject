import java.util.Scanner;

public class p9 {

        // functia de pornire a programului FirstDemo.
        // @param args argumentele de intrare ale pgrogramului

        public static void main(String[] args) {

                Scanner input = new Scanner(System.in); // System.in este tastatura
                int n = input.nextInt(); // introducerea unui numar intreg de la tastatura
               int m=0;
               for(int i=1 ;i<=n;i++) {
            	   if(n%i==0)
            		   m++;
               }
            if(m==2)	System.out.println("DA");
            else	System.out.println("NU");
        }
        }
