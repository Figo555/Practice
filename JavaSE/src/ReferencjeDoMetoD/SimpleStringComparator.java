package ReferencjeDoMetoD;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimpleStringComparator {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Olaf", "Dudek", "Magda", "Karola", "Dominiczka");
		
		Collections.sort(names, String::compareToIgnoreCase);
		
		for(String name: names) {
			System.out.println(name);
		}
	}

}
