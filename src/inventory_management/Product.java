package inventory_management;

public class Product {
	private String id;
	private String itemName;
	private double price;
	private int quantity;
	
	public Product(String id, String itemName, double price, int quantity) {
		this.id=id;
		this.itemName=itemName;
		this.price=price;
		this.quantity=quantity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
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

	
	
	

}
