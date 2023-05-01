package Curs6;

public class MagicSquare {

	public static void main(String[] args)
	{
	    int square [][]= new int[2][2];
	    int s=0; int a=0; int c=0; int b=0;
	    square[0][0] =1;
	    square[0][1] =1;
	    square[1][0] =1;
	    square[1][1] =1;
	    for(int i=0;i<2;i++) {
	    	for(int j=0;j<2;j++) {
	    		s=s+square[i][j];}
	    		System.out.println(s);
	    if(a==0) a=s;
	    	if(a==s) c++;
	    	else return;
	    	s=0; }  // linii
	    
	    for(int j=0;j<2;j++) {
	    for(int i=0;i<2;i++) {
	    	s=s+square[i][j];
			}
	    		System.out.println(s);
    	if(a==s) c++;
    		else return;
    	s=0;    // coloane
    	
    	for(int i=0;i<2;i++)
    		{s=s+square[i][i];}
    	if(a==s) b++;
			else return;
    			s=0; //diagonala principala
    			
    			 for(int i=0;i<2;i++) {
    				    for(int j=0;j<2;j++) {
    			if(i+j==2)
    				s=s+square[i][i];}
    				    if(a==s) b++;
    					else return;
    			 }
    	
	    
	    if(c==b) System.out.println("Adevarat");
	    else 	 System.out.println("Fals");
	}
}
