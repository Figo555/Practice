package Iteratory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoverException {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Kasia");
		names.add("Ola");
		names.add("Ewa");
		names.add("Gra¿ynka");
		names.add("Ania");
		names.add("Ela");
		
		//pêtla ok, bo nie korzystamy z iteratora
		System.out.println(">>>>Pêtla 1");
		for(int i = 0; i< names.size(); i++) {
			String name = names.get(i);
			System.out.println(name);
			if (name.equals("Ewa")) {
				names.remove(name);
			}
		}
		
		Iterator<String> namesIterator = names.iterator();
		System.out.println(">>> Pêtla 2");
		while (namesIterator.hasNext()) {
			String name = namesIterator.next();
			System.out.println(name);
			if (name.equals("Kasia")) {
				namesIterator.remove();
			}
		}
		
		System.out.println(">>> Pêtla 3");
		for (String name : names) {
			System.out.println(name);
			if (name.equals("Ania")) {
				// b³¹d - iterujey po kolekcji za pomoc¹ niejawnego iteratora
				// pêtli for-each, a usuwamy obiekt metod¹ remove() bezpoœrednio z kolekcji
				names.remove(name);
			}
		}
	}
	
	

}
