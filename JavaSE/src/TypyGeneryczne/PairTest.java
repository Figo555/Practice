package TypyGeneryczne;

public class PairTest {

	public static void main(String[] args) {
		Pair<String, Integer> p1 = new Pair<>("Ania", 1987);
		Pair<Double, String> p2 = new Pair<>(33.3, "Olaf");
		Pair<String, Boolean> p3 = new Pair<>("Influenser", true);
		
		PairTest.printPair(p1);
		PairTest.printPair(p2);
		PairTest.printPair(p3);
		
		
	}



	private static <T, V> void printPair(Pair<T, V> pair) {
		System.out.println(pair.getT() + " ; " +pair.getV());
	}

}
