package com.day1;

import java.util.ArrayList;

public class ShoppingCart {
	ArrayList<String>product=new ArrayList<>();
	public void addProduct(String item)
	{
		product.add(item);
		
	}
	public void removeProduct(String item)
	{
		product.remove(item);
	}
	public void showCart()
	{
		for(String cartItem: product)
		{
			System.out.println(cartItem);
		}
	}
	public static void main(String[] args) {
		ShoppingCart cart=new ShoppingCart();
		cart.addProduct("Laptop");
		cart.addProduct("keyboard");
		cart.addProduct("mouse");
		cart.addProduct("printer");
		cart.addProduct("scaneer");
		cart.showCart();
		cart.removeProduct("mouse");
		cart.showCart();
		
	}

}
