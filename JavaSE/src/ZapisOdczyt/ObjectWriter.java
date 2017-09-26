package ZapisOdczyt;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import ZapisOdczyt.Model.Person;

public class ObjectWriter {
 public static void main(String[] args) {
	 String fileName = "person.obj";
	 Person p1 = new Person("Danuta", "Kowalska");
	 
	 try (
			 FileOutputStream fs = new FileOutputStream(fileName, true);
			 ObjectOutputStream os = new ObjectOutputStream(fs);
			 ) {
		 os.writeObject(p1);
	 } catch (FileNotFoundException e) {
		 e.printStackTrace();
	 } catch (IOException e) {
		 e.printStackTrace();
	 }
	 
	 System.out.println("Zapisano obiekt do pliku");
 }
}
