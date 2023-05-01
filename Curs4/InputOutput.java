package Curs4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;


public class InputOutput {
	
	public static void writeTextToFile(String text, String fileName) {
		try {
			File file= new File(fileName);
			if (!file.exists())
				file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter fileBuffer = new BufferedWriter(fileWriter);
	
			fileBuffer.write(text);
			
			 //forteaza trimiterea datelor
			fileBuffer.close(); //salveaza si se inchide fisierul
			
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
	
	public static void readTextFromFile(String fileName) {
		try {
			FileReader file = new FileReader(fileName);
			BufferedReader readFile = new BufferedReader(file);
			
			String line = readFile.readLine();
			while(line != null) {
				System.out.println(line);
				line = readFile.readLine();
			}
			readFile.close();
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
	
	//writeTextToFile("Buna! Ce mai faci?", "fisier.txt");
	readTextFromFile("fisier.txt");
	}
}