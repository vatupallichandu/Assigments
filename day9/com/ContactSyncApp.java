package day9.com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ContactSyncApp {
	public static void main(String[] args) {
		String[]simContacts= {"Sravan","manoj","jeevan","kranthi"};
		String[]googleContacts= {"Ramya","Nisha","pranali","rajini","chandu"};
		String[]mobileContacts= {"Anand","pavan","venky","chitti","chandu"};
		Set<String>unique=new LinkedHashSet();
		for(String contact:simContacts ) {
			unique.add(contact);
		}
		for(String contact:googleContacts ) {
			unique.add(contact);
		}
		for(String contact:mobileContacts ) {
			unique.add(contact);
		}

		System.out.println("All Contact List");
		for(String contact: unique ) {
			System.out.println(" - " +contact);
		}


	}
 

	}

		