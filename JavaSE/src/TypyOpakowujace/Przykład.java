package TypyOpakowujace;

public class Przyk³ad {

	public static void main(String[] args) {
		int num = 5;
		Integer num1 = new Integer(num);
		Integer num2 = Integer.valueOf(num);
		System.out.println(num1);
		System.out.println(num2);
		
		String number = Integer.toString(num);
		System.out.println(number);
	}

}
