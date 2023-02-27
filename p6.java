import java.util.Scanner;

public class p6 {

        // functia de pornire a programului FirstDemo.
        // @param args argumentele de intrare ale pgrogramului

        public static void main(String[] args) {

                Scanner input = new Scanner(System.in); // System.in este tastatura
                int n = input.nextInt(); // introducerea unui numar intreg de la tastatura
                int s=0;
                int i=1;
                		while(n!=0) {
                		if(i%2==1) {
                			s=s+i;
                			n=n-1;
                		}
                i=i+1;
             
                		}
                		System.out.println(s);
        }
        }
