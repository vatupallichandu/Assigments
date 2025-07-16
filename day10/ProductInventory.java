package day10;

import java.util.HashMap;
import java.util.Map;
class Product
{
  private String name;
  private double price;
  private int stock;
 
  public Product(String name, double price, int stock) {
	super();
	this.name = name;
	this.price = price;
	this.stock = stock;
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
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
@Override
public String toString() {
	return "Product [name=" + name + ", price=" + price + ", stock=" + stock + "]";
}

}

public class ProductInventory{
	public static void main(String[] args) {
		Map<String,Product> inventory=new HashMap();
		inventory.put("p001",new Product("Vivo T3 5g",70999.00,15));
		inventory.put("p002",new Product("Samsung",60999.00,19));
		inventory.put("p003",new Product("oneplus",80999.00,18));
		System.out.println(inventory);
		String searchId="p004";
		Product searchProduct=inventory.get(searchId);
		if(searchProduct!=null)
		{
			System.out.println("Product Found:"+searchProduct);
		}
		else
		{
			System.out.println("product not found");
		}
		
		
	}
	
}
