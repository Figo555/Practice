package TypyGeneryczne;

public class GenericMehods {

	public static void main(String[] args) {
		GenericMehods gm = new GenericMehods();
		gm.print5T(2);
		gm.print5T("Krzysio");
	}

	private <T> void print5T(T args) {
		for(int i=0; i<5; i++) 
			System.out.println(args);
	}

}
