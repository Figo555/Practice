package ZapisOdczyt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import ZapisOdczyt.Model.Person;

public class ObjectReader {

	public static void main(String[] args) {
		String fileName = "person.obj";
		
		Person p1 = null;
		
		try(
				FileInputStream fis = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(fis);
				) {	
		p1 = (Person) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		if(p1 != null) {
			System.out.println("Wczytano dane z pliku...");
			System.out.println(p1.getFirstName() + " " + p1.getLastName());
		}
				
	}

}
