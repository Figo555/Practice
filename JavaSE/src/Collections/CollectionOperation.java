package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionOperation {

	public static void main(String[] args) {
		String sentence = "Strona testowa s³u¿y dwóm celom: stanowi wizualne potwierdzenie \"\r\n" 
				                + "dzia³ania drukarki i mo¿e równie¿ zawieraæ informacje pomocne podczas"  
				               + "rozwi¹zywania problemów, takie jak szczegó³y dotycz¹ce sterownika drukarki.";
		List<String> words = Arrays.asList(sentence.split(" "));
		System.out.println("List oryginalna: ");
		printCollection(words);
		
		//wymieszanie s³ów
		Collections.shuffle(words);
		System.out.println("List shuffle");
		printCollection(words);
		
		//sortowanie
		Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
		System.out.println("Lista sosrt");
		printCollection(words);
		
		//wyszukiwanie binarne 
		int  position = Collections.binarySearch(words, "drukarki");
		System.out.println("S³owo \"drukarki\" jest w liœcie na " + position + " miejscu");
		
		//iloœæ wyst¹pieñ
		int freq = Collections.frequency(words, "Strona");
		System.out.println("S³owo \"Strona\" wystêpuje na liœcie " + freq + " razy");
		
		//najmniejszy element w liœcie
		System.out.println("Najmniejszy element w liœcie to: " + Collections.min(words));
		
	}

	private static void printCollection(List<String> collection) {
		for(String s: collection) {
			System.out.println(s + "; ");
		}
		System.out.println();
	}

}
