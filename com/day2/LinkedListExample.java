package com.day2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> callhistory=new LinkedList<>();
		callhistory.add("Nisha");
		callhistory.add("Ramya");
		callhistory.add("Rajini");
		callhistory.add("chandu");
		System.out.println(callhistory);
		System.out.println("Total size"+callhistory.size());
		System.out.println("search"+callhistory.contains("Ramya"));
		System.out.println("get the name from call log"+callhistory.get(3));
		//callhistory.add("srinivas");
		callhistory.set(3,"Aruna");
		System.out.println(callhistory);
		
		
	}

}
