package Zbiory;

import java.util.HashSet;

public class PersonSet {

	public static void main(String[] args) {
		HashSet<Person> persons = new HashSet<>();
		
		persons.add(new Person("Jan", "Czarnecki"));
		persons.add(new Person("Jan", "Czarnecki"));
		persons.add(new Person("Kmicic", "Czes³aw"));
		persons.add(new Person("Janusz", "Podbipiêta"));
		persons.add(new Person("Pan", "Tadeusz"));
		persons.add(new Person("Pan", "Zag³oba"));
		
		System.out.println("Person.size() " + persons.size());
		System.out.println("contains Jan Czarnecki? " + persons.contains(new Person("Jan", "Czarnecki")));
		persons.remove(new Person("Pan", "Tadeusz"));
		System.out.println("Person.size() " + persons.size());
	}

}
