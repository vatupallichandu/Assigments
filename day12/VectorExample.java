package day12;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<String>animals=new Vector<>();
		animals.add("Dog");
		animals.add("Buffalo");
		animals.add("Tiger");
		System.out.println(animals);
		animals.add(0,"Lion");
		System.out.println(animals);
		System.out.println(animals.get(2));
		System.out.println(animals.remove(0));
		System.out.println(animals.contains("cat"));
		System.out.println(animals.size());
	}

}
