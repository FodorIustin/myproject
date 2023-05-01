package curs5;
import java.util.Iterator;
import java.util.TreeSet;
public class Trees {

	public static void main(String[] args) {
		 
		TreeSet<String> lista = new TreeSet<String>();
		lista.add("Mere");
		lista.add("Pere");
		lista.add("Banane");
		lista.add("Kiwi");
		lista.add("Kiwi");
			
		Iterator<String> it = lista.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	}

