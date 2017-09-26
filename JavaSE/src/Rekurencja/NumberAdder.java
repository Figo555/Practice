package Rekurencja;

public class NumberAdder {

	public static void main(String[] args) {
		NumberAdder adder = new NumberAdder();
		
		int number = adder.sum(5);
		System.out.println(number);
	}

	private int sum(int i) {
		if(i>1) {
			System.out.println(i + "+" + "sum(" + (i-1) +")");
			return i * sum(i-1);
		} else {
		return i;
	}
	}

}
