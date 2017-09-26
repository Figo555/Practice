package KlasaComparableComparator;

import java.util.Arrays;
import java.util.Comparator;

public class ProductCatalog {

	public static void main(String[] args) {
		Product[] products = new Product[7];
		products[0] = new Product("Panasonic", "Odtwarzacz", "Audio");
		products[1] = new Product("Sony", "Wzmacniacz", "Audio");
		products[2] = new Product("Kenwood", "Radio", "Audio");
		products[3] = new Product("Pioner", "Wzmacniacz", "Audio");
		products[4] = new Product("Sony", "Radio", "Audio");
		products[5] = new Product("Philips", "Radio", "Audio");
		products[6] = new Product("D&B", "S³uchawki", "Audio");
		
		System.out.println("Nieposortowane");
		for(Product p: products) {
			System.out.println(p);
		}
		
		Arrays.sort(products);
		System.out.println("Posortowane: ");
		for(Product p: products) {
			System.out.println(p);
		}
		
		Arrays.sort(products, new Comparator<Product>() {
		    @Override
		    public int compare(Product o1, Product o2) {
		        return o1.getProducer().compareTo(o2.getProducer());
		    }
		});
 	}
	
	

}
