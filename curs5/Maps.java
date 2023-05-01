package curs5;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class Maps {

	public static void main(String[] args) {
		 
		TreeMap<Integer ,String> lista = new TreeMap<Integer ,String>();
		lista.put(1, "Mere");
		lista.put(2, "Pere");
		lista.put(3, "Banane");
		lista.put(4, "Banane");
		lista.put(5, "Kiwi");
		
		Set multime = lista.entrySet();
		Iterator it = multime.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> element = (Map.Entry<Integer, String>) it.next();
			System.out.println("Cheia: " + element.getKey() + "si Valoarea: "+ element.getValue());
		}
	}
	}

