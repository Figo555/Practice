package ArrayList;

import java.util.*;

public class ArrayList22 {

	public static void main(String[] args) {
		 ArrayList<Integer> ints = new ArrayList<>();
		 
		 for(int i=0; i<100; i++) {
			 ints.add(i);
		 }
		 
		 System.out.println("ints.get(50) = " + ints.get(50));
		 System.out.println("Ilosc elementow na liœcie: "+ ints.size());
		 System.out.println("Czyszcz¹ tablicê: ");
		 ints.clear();
		 System.out.println("Iloœæ elementów na liœcie: " + ints.size());
	}	

}
