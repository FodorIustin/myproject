import java.util.Scanner;

public class p17 {

        // functia de pornire a programului FirstDemo.
        // @param args argumentele de intrare ale pgrogramului

        public static void main(String[] args) {

                Scanner input = new Scanner(System.in); // System.in este tastatura
                int n = input.nextInt(); // introducerea unui numar intreg de la tastatura
               int m=0;
               while(n!=0) {
            	   if(n%10>m)
            		   m=n%10;
               		n=n/10;}
            		  System.out.println(m);
               }
        

        }
        
