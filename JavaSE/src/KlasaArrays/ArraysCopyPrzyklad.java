package KlasaArrays;

public class ArraysCopyPrzyklad {

	public static void main(String[] args) {
		int[] numbers1 = {1,2,4,23, 3, 4};
		int[] numbers2 = new int[numbers1.length];
		System.arraycopy(numbers1, 4, numbers2, 0, numbers1.length-4);
		
		for(int num: numbers2) {
			System.out.println(num + " ");
		}
	}

}
