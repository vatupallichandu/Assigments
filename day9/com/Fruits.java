package day9.com;

import java.util.LinkedHashSet;
import java.util.Set;

public class Fruits {
	public static void main(String[] args) {
		String[]greenFruits= {"guava","watermelon","kiwi","grapes","mango"};
		String[]yellowFruits= {"pineapple","papaya","lemon","mango"};
		String[]redFruits= {"Apple","cherry","strawberry","pomogranate","guava"};
		Set<String>unique=new LinkedHashSet();
		for(String fruit:greenFruits ) {
			unique.add(fruit);
		}
		for(String fruit:yellowFruits ) {
			unique.add(fruit);
		}
		for(String fruit:redFruits ) {
			unique.add(fruit);
		}
		System.out.println("All Fruits List");
		for(String fruit: unique ) {
			System.out.println(" - " +fruit);
		}

		
		
		
	}

}
