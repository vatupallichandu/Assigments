package com.day1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String>shopping_list=new ArrayList<String>();
		shopping_list.add("Shampoo");
		shopping_list.add("Soaps");
		shopping_list.add("perfume");
		shopping_list.add(0,"handwash");
		shopping_list.add(1,"shoes");
		
		System.out.println(shopping_list);
		System.out.println(shopping_list.size());
		shopping_list.remove(0);
		System.out.println(shopping_list);
		System.out.println(shopping_list.size());
	}

}
