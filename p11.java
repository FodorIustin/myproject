import java.util.Scanner;

public class p11 {

        // functia de pornire a programului FirstDemo.
        // @param args argumentele de intrare ale pgrogramului

        public static void main(String[] args) {

                Scanner input = new Scanner(System.in); // System.in este tastatura
                int n = input.nextInt(); // introducerea unui numar intreg de la tastatura
               int m=0;
               for(int i=1 ;i<=n;i++) {
            	   if(n%i==0)
            		   System.out.println(i);
               }
            	
        }
        }
