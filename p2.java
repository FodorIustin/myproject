import java.util.Scanner;

public class p2 {

        // functia de pornire a programului FirstDemo.
        // @param args argumentele de intrare ale pgrogramului

        public static void main(String[] args) {

                Scanner input = new Scanner(System.in); // System.in este tastatura
                int i = input.nextInt(); // introducerea unui numar intreg de la tastatura
                int a = input.nextInt();
               
               		switch(i) {
               		case 1:
               			System.out.println("UNU");
               			break;
               		case 2:
               			System.out.println("DOI");
               			break;
               		case 3:
               			System.out.println("TREI");
               			break;
               		case 4:
               			System.out.println("PATRU");
               			break;
               		case 5:
               			System.out.println("CINCI");
               			break;
               			default:
               				System.out.println("INVALID");
     
                }

        }
}