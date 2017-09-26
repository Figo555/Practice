package Iteratory;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetIterator {

	public static void main(String[] args) {
		Set<Integer> numb = new TreeSet<>();
		numb.add(23);
		numb.add(32);
		numb.add(43);
		numb.add(454);
		numb.add(2);
		numb.add(234);
		
		Iterator<Integer> numInterator = numb.iterator();
		while(numInterator.hasNext()) {
			int numbs = numInterator.next();
			System.out.println(numbs);
		}
	}

}
