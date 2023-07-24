package oopWithNLayeredApp.entities;

public class Product {
	private int id;
	private String name;
	private double unitPrice;

	public Product() {

	}

	public Product(int id, String name, double unitPrice) {
		this.name = name;
		this.id = id;
		this.unitPrice = unitPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
