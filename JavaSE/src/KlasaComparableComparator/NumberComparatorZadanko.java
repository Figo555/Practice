package KlasaComparableComparator;

import java.util.Arrays;
import java.util.Comparator;

public class NumberComparatorZadanko {

	public static void main(String[] args) {
		Integer[] numbers = {1, 5, 3, 6, 34, 543, 314, 654, 3422, 34, 24, 6, 7, 88};
		System.out.println("Nieposortowane: ");
		System.out.println(Arrays.toString(numbers));
		
		Arrays.sort(numbers);
		System.out.println("Posortowano rosn¹co: ");
		System.out.println(Arrays.toString(numbers));
		
		Arrays.sort(numbers, new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				return -(o1.compareTo(o2));
			}
			
		});
		System.out.println("Posortowano malej¹co: ");
		System.out.println(Arrays.toString(numbers));
	}

}
