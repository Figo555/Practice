package TypyGeneryczne;

public class GenericTester {

	public static void main(String[] args) {
		//definiujemy kontener przechowywuj¹cy liczby ca³kowite
		Container<Integer> integers = new Container<Integer>();
		//przypisujemy now¹ tablicê typu Integer
		integers.setArray(new Integer[5]);
		//do pierwszego elementu przypisujemy liczbê 5
		integers.getArray()[0]= 5;
		integers.getArray()[1] = 5432;
		
		//tworzymy kontenet przechowuj¹cy obiekty String
		Container<String> strings = new Container<String>();
		//przypisujemy tablicê typu String
		strings.setArray(new String[10]);
		//przypisujemy 1 i 2 elementy tablicy
		strings.getArray()[0] = "Ania";
		strings.getArray()[1] = "Basia";
		
		//odczytanie danych bez koniecznoœci rzutowania
		Integer num = integers.get(1);
		Integer num2 = integers.get(0);
		String str = strings.get(1);
		String str2 = strings.get(0);
		
		//wyœwietlnie wartoœci
		System.out.println(num2 + num);
		System.out.println(str + str2);
	}

}
