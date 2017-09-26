package TypyOpakowujace;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Zadanie {

	public static void main(String[] args) {

		BigInteger num1 = new BigInteger("123");
		BigInteger num2 = new BigInteger("1234");
		BigInteger num3 = new BigInteger("12345");
		BigInteger num4 = new BigInteger("123456789123456789");
		BigInteger num5 = new BigInteger("987654321987654321");
		num1 = num1.add(num2);
		num1 = num1.add(num3);
		System.out.println(num1);
		
		num4 = num4.add(num5);
		System.out.println(num4);
		
		// Prawid³owe rozwi¹zanie zadania.
		String fileName = "numbers.txt";
		int a=0, b=0, c=0;
		BigInteger aBig = null, bBig = null;
		
		try(
			FileReader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr);
				) {
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
			c = Integer.parseInt(br.readLine());
			aBig = new BigInteger(br.readLine());
			bBig = new BigInteger(br.readLine());
		} catch (FileNotFoundException e) {
			System.err.println("Nie znaleziono pliku");
		} catch (IOException e) {
			System.err.println("B³¹d odczytu danych");
		}
		
		System.out.println("a+b+c = " + (a+b+c));
		System.out.println("aBig+bBig = " +aBig.add(bBig) );
		
	}

}
