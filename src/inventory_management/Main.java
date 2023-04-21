package inventory_management;

public class Main {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		
		inventory.createInventory("ct001", "Landmark", 120, 5);
		inventory.createInventory("oc002", "Oakridge", 110, 5);
		
		inventory.showInventories();
	}

}
