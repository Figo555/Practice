package Rekurencja;

public class OddTester {

	public static void main(String[] args) {
		OddTester ot = new OddTester();
		ot.checkNumber(10);
		ot.checkNumber(11);
	}

	private void checkNumber(int i) {
		String check = i%2 == 0? "Parzysta " : "Nieparzysta";
		System.out.println(i + " " + check);
	}

}
