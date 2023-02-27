import java.util.Scanner;

public class p4 {

        // functia de pornire a programului FirstDemo.
        // @param args argumentele de intrare ale pgrogramului

        public static void main(String[] args) {

                Scanner input = new Scanner(System.in); // System.in este tastatura
                int i = input.nextInt(); // introducerea unui numar intreg de la tastatura
                Scanner inpu = new Scanner(System.in); // System.in este tastatura
                int a = inpu.nextInt();
                Scanner inp = new Scanner(System.in); // System.in este tastatura
                int b = inp.nextInt();
             
              int m=i;
              if(a<m)
            	  m=a;
              if(b<m)
            	  m=b;
            	  
            	  System.out.println(m);
        }
        }
