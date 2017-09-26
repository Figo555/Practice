package Strumienie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Struumien {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numbers = numbers.stream()
				.filter(x-> x%2 == 0 && x>5)
				.collect(Collectors.toCollection(ArrayList::new));
		
		numbers.forEach(System.out::println);
		
		System.out.println("\n------------------------\n");
		
		Stream<String> strings = Stream.of("a", "bb", "ccc", "dddd", "eeeee");
		List<String> stringList = strings.map(String::toUpperCase)
				.peek(System.out::println)
				.collect(Collectors.toList());
		
		System.out.println("\n------------------------\n");
		
		Stream<Integer> numStream = Stream.iterate(0, x -> x+1);
		//lista 100 pierwszych liczb podzielnych przez 2
		List<Integer> numbs = numStream.filter(x -> x%2 == 0)
				.limit(10)
				.peek(System.out::println).collect(Collectors.toList());

		System.out.println("\n------------------------\n");
		
		//lista kwadratów kolejnych 10 liczb ca³kowitch
		List<Integer> squareNumbers = numStream.map(x -> x*x)
				.limit(10)
				.peek(System.out::println)
				.collect(Collectors.toList());

		System.out.println("\n------------------------\n");
		
		List<Integer> minusNumbers = numStream.map(x -> -x)
				.limit(10)
				.peek(System.out::println)
				.collect(Collectors.toList());
	}

}
