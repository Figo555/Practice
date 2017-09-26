package KlasaArrays;

import java.util.Arrays;

public class ArraysPrzyklad {
	
	public static void main(String[] args) {
		String[] names = {"Basia", "Kasia", "Wasia", "Asia", "Paulinka", "Patrycja", "Ewa"};
		Integer[] numbers = {4, 3, 43, 213, 54353, 32};
		
		System.out.println("Names: ");
		printArrays(names);
		
		System.out.println("Numbers: ");
		printArrays(numbers);
		System.out.println();
		
		//sortowanie
		System.out.println("Arrays.sort(numbers): ");
		Arrays.sort(numbers);
		printArrays(numbers);
		
		System.out.println("Arrays.sort(names): ");
		Arrays.sort(names);
		printArrays(names);
		System.out.println();
		
		//copyOf
		System.out.println("Numbers2, Arrays.copyOf() ");
		Integer[] numbers2 = Arrays.copyOf(numbers, numbers.length);
		printArrays(numbers2);
		System.out.println();
		
		//equals
		System.out.println("Arrays.equals(numbers, numbers2): ");
		System.out.println(Arrays.equals(numbers, numbers2));
		System.out.println();
		
		//fill
		System.out.println("Arrays.fill()");
		String[] strings = new String[5];
		Arrays.fill(strings, "Wacek");
		printArrays(strings);
		
	}

	private static<T> void printArrays(T[] arr) {
		for(T t: arr) {
			System.out.println(t + " ");
			
		}
		System.out.println();
	}
}
