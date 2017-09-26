package TypyOpakowujace;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {

	public static void main(String[] args) {
		//Przyklad
		double a = 0.7;
		double b = 0.3;
		System.out.println(a - b);
		
		//Rozwi¹zanie
		BigDecimal big1 = new BigDecimal("23219387129");
		BigDecimal big2 = BigDecimal.valueOf(0.7);
		
		System.out.print(big1.subtract(big2));
	}

}
