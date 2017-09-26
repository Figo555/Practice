package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionOperation {

	public static void main(String[] args) {
		String sentence = "Strona testowa s�u�y dw�m celom: stanowi wizualne potwierdzenie \"\r\n" 
				                + "dzia�ania drukarki i mo�e r�wnie� zawiera� informacje pomocne podczas"  
				               + "rozwi�zywania problem�w, takie jak szczeg�y dotycz�ce sterownika drukarki.";
		List<String> words = Arrays.asList(sentence.split(" "));
		System.out.println("List oryginalna: ");
		printCollection(words);
		
		//wymieszanie s��w
		Collections.shuffle(words);
		System.out.println("List shuffle");
		printCollection(words);
		
		//sortowanie
		Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
		System.out.println("Lista sosrt");
		printCollection(words);
		
		//wyszukiwanie binarne 
		int  position = Collections.binarySearch(words, "drukarki");
		System.out.println("S�owo \"drukarki\" jest w li�cie na " + position + " miejscu");
		
		//ilo�� wyst�pie�
		int freq = Collections.frequency(words, "Strona");
		System.out.println("S�owo \"Strona\" wyst�puje na li�cie " + freq + " razy");
		
		//najmniejszy element w li�cie
		System.out.println("Najmniejszy element w li�cie to: " + Collections.min(words));
		
	}

	private static void printCollection(List<String> collection) {
		for(String s: collection) {
			System.out.println(s + "; ");
		}
		System.out.println();
	}

}
