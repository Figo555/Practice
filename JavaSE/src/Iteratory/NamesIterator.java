package Iteratory;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class NamesIterator {
	public static void main(String[] args) {
		Map<String, String> names = new TreeMap<>();
		
		names.put("Kowalski", "Jan Kowalski - 35");
		names.put("Zakrzewski", "Rafa³ Zakrzewski - 32");
		names.put("Hoffman", "Dan Hoffman - 39");
		names.put("Koniecpolski", "Ilian Koniecpolski - 58");
		names.put("Radziwi³", "Janusz Radziwi³ - 60");
		names.put("Dutkiewicz", "Stefan Dutkiewicz - 62");
		
		Iterator<String> valueIterator = names.values().iterator();
		
		while(valueIterator.hasNext()) {
			System.out.println(valueIterator.next());
		}
	}
}
