package inventory_management;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
Integer id;
String itemName;
double price;
int quantity;
 */

public class Inventory {
	
	//내 머리로 먼저 생각한게 아니니까 HashMap 가지고만 먼저 해보기
	//Key: id , value: product 객체
	private Map<String, Product> productMap;
	
	//id만 담아놓은 set-중복 될 수 없다
	//inventory 관리하기 편하게 하기 위해서 만듬. 
	private Set<String> idSet;
	
	public Inventory() {
		this.productMap = new HashMap<>();
		this.idSet = new HashSet<>();
	}
	
	
	//void createInventory(int id, String itemName, double pirce, int quantity);
	public void createInventory(String id, String itemName, double price, int quantity) {
		//중복되는게 없으면 새로 만들고
		if(!productMap.containsKey(id)){
			Product product = new Product(id, itemName, price, quantity);
			productMap.put(id, product);
		}
		//중복되는 게 있으면 이미 존재한다고 알려주기.
		else {
			System.out.println(itemName + " is already exist.");
			System.out.println(productMap.get(itemName));
		}
	}


	public void showProduct(Product product) {
		System.out.println(product.getItemName() + " | " 
				+ product.getPrice() + " | " 
				+ product.getQuantity() );
	}
	
	//void showInventories();
	public void showInventories() {
		System.out.println("====CURRENT INVENTORY LIST====");
		for (Map.Entry<String, Product> entry: productMap.entrySet()) {
			System.out.printf("["+entry.getKey()+"] ");
			showProduct(entry.getValue());
			
		}
	}
	
	//void updateQuantityByName(String itemName, int quantity);
	
	//void updateQuantityById(int id, int quantity);
	
	//void deleteInventoryByName()
	
	//void deleteInventoryById()
	
	//void getProductQtyByName()
	
	//void getProductQtyById()
	
	//double getTotalInventoryValue()
	
	

}
