package br.com.benefrancis.estudos.prod;

public class Product {
//	@Getter @Setter
	private String name;
//	@Getter
	private int quantity;
//	@Getter @Setter
	private double price;

	public Product(String name) {
		this.name = name;
		this.quantity = 1;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	protected void setQuantity(int quantity) {
		if (quantity < 1) {
			this.quantity = 1;
		} else {
			this.quantity = quantity;
		}

	}
}