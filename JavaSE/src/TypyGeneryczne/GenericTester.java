package TypyGeneryczne;

public class GenericTester {

	public static void main(String[] args) {
		//definiujemy kontener przechowywuj�cy liczby ca�kowite
		Container<Integer> integers = new Container<Integer>();
		//przypisujemy now� tablic� typu Integer
		integers.setArray(new Integer[5]);
		//do pierwszego elementu przypisujemy liczb� 5
		integers.getArray()[0]= 5;
		integers.getArray()[1] = 5432;
		
		//tworzymy kontenet przechowuj�cy obiekty String
		Container<String> strings = new Container<String>();
		//przypisujemy tablic� typu String
		strings.setArray(new String[10]);
		//przypisujemy 1 i 2 elementy tablicy
		strings.getArray()[0] = "Ania";
		strings.getArray()[1] = "Basia";
		
		//odczytanie danych bez konieczno�ci rzutowania
		Integer num = integers.get(1);
		Integer num2 = integers.get(0);
		String str = strings.get(1);
		String str2 = strings.get(0);
		
		//wy�wietlnie warto�ci
		System.out.println(num2 + num);
		System.out.println(str + str2);
	}

}
