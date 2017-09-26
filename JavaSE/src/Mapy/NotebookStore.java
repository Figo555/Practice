package Mapy;

import java.util.HashMap;
import java.util.Map;

public class NotebookStore {

	public static void main(String[] args) {
		Map<String, Notebook> noteb = new HashMap<>();
		noteb.put("B590", new Notebook("Lenovo", "B590"));
		noteb.put("Inspirion0211A", new Notebook("Dell", "Inspiro"));
		noteb.put("Pentium44", new Notebook("Apple", "G5092"));
		noteb.put("Dell 0.3c", new Notebook("Dell", "G778"));
		noteb.put("XPS50091V", new Notebook("ASUS", "BCD00"));
		
		//wyœwietlamy zbiór kluczy
		System.out.println("Modele laptopów: ");
		for(String key: noteb.keySet()) {
			System.out.println(key);
		}
		
		//wyœwietlamy informacjê o laptopach na podstawie kluczyo
		String key = "Inspirion0211A";
		System.out.println("Znaleziono laptop o kodzie Inspirion0211A");
		System.out.println(noteb.get(key));
		
		//usuwamy obiekt na podstawie klucza
		noteb.remove("Pentium44");
		
		System.out.println("Iloœæ produktów w sklepie " + noteb.size());
	}

}
