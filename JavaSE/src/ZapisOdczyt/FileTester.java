package ZapisOdczyt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTester {
	public static void main(String[] args) {
		String fileName = "textFile.txt";
		FileReader fileReader = null;
		BufferedReader reader = null;
		try {
			fileReader = new FileReader(fileName);
			reader = new BufferedReader(fileReader);
			String nextLine = null;
			int lines = 0;
			while (( nextLine = reader.readLine()) != null) {
				System.out.println(nextLine);
				lines++;
			}
			System.out.println("ilosc wierszy w pliku: " + lines);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null)
					reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
