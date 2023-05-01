package curs5;

import java.util.LinkedList;
public class Colectii{


	public static void main(String[] args) {
		int[] tablouIntregi = new int[3];
		tablouIntregi[0] = 100;
		tablouIntregi[1] = 200;
		
		for(int i: tablouIntregi) {
			System.out.println(i);
		}
			LinkedList<String> lista = new LinkedList<String>();
			lista.add("Mere");
			lista.add("Pere");
			lista.add("Banane");
			lista.addFirst("Kiwi");
				for(String str : lista) {
					System.out.println(str);
		
	}
	}
}
