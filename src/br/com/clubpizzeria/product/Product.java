package br.com.clubpizzeria.product;

public class Product {

	private int id;
	private String description;
	private double price;
	private int quantity;

	public Product(int id, String description) {
		this.id = id;
		this.description = description;
	}

	public Product(String description) {
		this.description = description;
	}

	public Product() {
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;

	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [description=" + description + ", price=" + price + ", quantity=" + quantity + "]";
	}

}
