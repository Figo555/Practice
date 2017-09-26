package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PolymorphicList {

	public static void main(String[] args) {
		LinkedList<Integer> ints1 = new LinkedList<>();
		ArrayList<Integer> ints2 = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			ints1.add(i);
			ints2.add(i);
		}
		
		printList(ints1);
		printList(ints2);
	}

	private static void printList(List<Integer> list) {
		for(Number n: list) {
			System.out.println(n);
		}
	}

}
