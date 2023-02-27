import java.util.Scanner;

public class p3 {

        // functia de pornire a programului FirstDemo.
        // @param args argumentele de intrare ale pgrogramului

        public static void main(String[] args) {

                Scanner input = new Scanner(System.in); // System.in este tastatura
                int i = input.nextInt(); // introducerea unui numar intreg de la tastatura
                Scanner inpu = new Scanner(System.in); // System.in este tastatura
                int a = inpu.nextInt();
               
               		if(i%2==0 && a%2==0)
               			System.out.println((i+a)/2);
               		if(i%2==1 && a%2==1)
               			System.out.println(i*a);
               		if(i%2!=a%2)
               			System.out.println(i+a);
                }


        }
