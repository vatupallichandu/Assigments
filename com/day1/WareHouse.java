package com.day1;

import java.util.ArrayList;
import java.util.List;

public class WareHouse {
	
		String[] productslots=new String[100];
		public void storeProduct(int slot,String product)
		{
			productslots[slot]=product;
		}
		public String getProduct(int slot)
		{
			System.out.println(productslots[slot]);
			return productslots[slot];
		}
		public static void main(String[] args) {
			WareHouse warehouse=new WareHouse();
			warehouse.storeProduct(20,"zeera");
			warehouse.getProduct(20);
			List<String> productSlots = new ArrayList<>();
		}
		
			
		
	}


