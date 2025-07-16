package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MainMap {
	public static void main(String[] args) {
		Map<String,List<String>>customer=new HashMap<>();


		customer.put("Fashion",Arrays.asList("priya","ramya","Nisha"));
		System.out.println(customer);
		customer.put("Laptops",Arrays.asList("chityala","chitti","Mnaoj"));
		//System.out.println(customer);
		customer.putIfAbsent("Electronics", new ArrayList<>());
		customer.get("Electronics").add("Anand");
		System.out.println(customer.size());
		System.out.println(customer.containsKey("Laptops"));
		System.out.println(customer.containsValue(Arrays.asList("chityala","chitti","Mnaoj")));
		
		for(Map.Entry<String, List<String>> entry : customer.entrySet())
		{
			System.out.println("category:"+entry.getKey());
		}
		for(Map.Entry<String, List<String>> entry : customer.entrySet())
		{
			System.out.println("category:"+entry.getValue());
		}
		
		for(Map.Entry<String, List<String>> entry : customer.entrySet())
		{
			System.out.println("category:"+entry.getKey()+ "customer"+entry.getValue());
		}
		
		
	}

}
