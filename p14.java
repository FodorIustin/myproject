import java.util.Scanner;

public class p14 {

        // functia de pornire a programului FirstDemo.
        // @param args argumentele de intrare ale pgrogramului

        public static void main(String[] args) {

               
                for(int i=1;i<1000;i++)
        			for(int j=1;j<1000;j++)
        				if(i+j==1000) {
        					if(i%17==0 || i%13==0)
        						if(j%19==0 || j%7==0)
        					System.out.println(i+ " " +j);}
               }
            
        }
        
