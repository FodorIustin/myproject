package Curs6Tema;
import java.util.HashSet;
public class HashEx {

	public static boolean containsAllVowels(String str) {
		HashSet<String> lista = new HashSet<String>();
		lista.add("a");
		lista.add("e");
		lista.add("i");
		lista.add("o");
		lista.add("u");
		for (int i = 0; i < str.length(); i++) {
	        char c = str.charAt(i);
	        if (lista.contains(c)) {
	            lista.remove(c);
	        }
	        if (lista.isEmpty()) {
	            return true;
	        }
	    }
	    return false;
	}
}

