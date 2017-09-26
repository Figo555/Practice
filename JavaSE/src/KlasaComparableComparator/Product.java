package KlasaComparableComparator;

import java.util.Comparator;

public class Product implements Comparable<Product> {
	private String producer;
	private String name;
	private String category;
	
	public Product(String producer, String name, String category) {
		this.producer = producer;
		this.name = name;
		this.category = category;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [producer=" + producer + ", name=" + name + ", category=" + category + "]";
	}

	@Override
	public int compareTo(Product o) {
		int categoryCompare = category.compareTo(o.getCategory());
		if(categoryCompare != 0) {
		return 1;
		}
		int producerCompare = producer.compareTo(o.getProducer());
		if(producerCompare != 0) {
			return producerCompare;
		}
		return name.compareTo(o.getName());
	}
	
	public static class ProductNameComparator implements Comparator<Product> {
	
	public int compare(Product p1, Product p2) {
		return p1.getName().compareTo(p2.getName());
	}
	}
	
	
}
