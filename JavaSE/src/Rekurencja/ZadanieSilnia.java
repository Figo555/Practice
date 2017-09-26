package Rekurencja;

public class ZadanieSilnia {

	public static void main(String[] args) {
		ZadanieSilnia zs = new ZadanieSilnia();
		int factArg = 3;
		int result = zs.factorial(factArg);
		
		System.out.println("Silnia " + factArg + " = " + result);
	}

	private int factorial(int n) {
		return n > 1 ? n * factorial(n - 1) : 1;
	}

}
