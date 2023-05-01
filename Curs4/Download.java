package Curs4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Download {

	public static void main(String[] args) {
		try {
			URL url = new URL ("https://www.emanuel.ro/");
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			BufferedWriter writer = new BufferedWriter(new FileWriter("download.html"));
			String line = reader.readLine();
			String str = "div";
			int index=0;
			while (line != null) {
				writer.write(line+"\n");
			//	System.out.println(line);
				int position = line.indexOf("div");
				while(position >=0) {
					index++;
					line=line.substring(position+3);
					position=line.indexOf("div");
				}
				 
					line=reader.readLine();
			}
			
			reader.close();
			writer.close();
			System.out.println("Nr "+index);
		}
		catch(IOException e){
			System.out.println("A aparut o eroare: "+e);
			
		}
		
	}
}


