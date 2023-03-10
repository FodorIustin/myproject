import java.util.Scanner;
public class piramida2 {
	 public static void main(String[] args) {

     	Scanner input = new Scanner(System.in);
 		int n = input.nextInt();
 		int j=0;
 		int p=n;
	
 		for(int i=1;i<=n;i++) {
 			while(j!=p) {
 				System.out.print(i);
 				j++;
 			}
 			System.out.println();
 		p=p-1;
 		j=0;
 			
 		}
	
	 }
}
