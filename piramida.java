import java.util.Scanner;
public class piramida {
	 public static void main(String[] args) {

     	Scanner input = new Scanner(System.in);
 		int n = input.nextInt();
 		int j=0;
 		int p=2;
	
 		for(int i=n;i>=1;i--) {
 			while(j!=p) {
 				System.out.print(i);
 				j++;
 			}
 			System.out.println();
 		p=p+2;
 		j=0;
 			
 		}
	
	 }
}
