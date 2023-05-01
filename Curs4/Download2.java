package Curs4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Download2 {

	public static void main(String[] args) {
		try {
			URL url = new URL ("https://www.emanuel.ro/");
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			BufferedWriter writer = new BufferedWriter(new FileWriter("download.html"));
			String line = reader.readLine();
			int index=0;
			while (line != null) {
				writer.write(line+"\n");
			//	System.out.println(line);
				int position = line.indexOf("href");
				
				while(position >=0) {
					line=line.substring(position+5);
					line=line.substring(0,4);
					while(index!=2)
						if()
					System.out.println(line);
					
					position=line.indexOf("href");
				}
				 
					line=reader.readLine();
			}
			
			reader.close();
			writer.close();
			
		}
		catch(IOException e){
			System.out.println("A aparut o eroare: "+e);
			
		}
		
	}
}


