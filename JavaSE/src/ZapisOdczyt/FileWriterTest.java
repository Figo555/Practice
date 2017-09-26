package ZapisOdczyt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) {
		String fileName = "textFile.txt";
		try (
			FileWriter fileWriter = new FileWriter(fileName, true);
			BufferedWriter writer = new BufferedWriter(fileWriter);
				) {
			writer.write("LOLEK");
			writer.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
