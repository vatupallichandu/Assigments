package day9.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AlphabeticSortByName {

    public static void main(String[] args) {

        // Contacts from SIM
        Contact1[] simContacts = {
            new Contact1( "Jeevan", "9876543210", "jeevan@sim.com","IT"),
            new Contact1( "Nisha", "9123456789", "nisha@sim.com","developer"),
            new Contact1( "Chitti", "9988776655", "chitti@sim.com","hr")
        };

        // Contacts from Google
        Contact1[] googleContacts = {
            new Contact1( "Jaya", "9876543210", "jaya@sim.com","developer"),
            new Contact1( "Nivetha", "9123456789", "nivi@sim.com","hr"),
            new Contact1("Chitti", "9988776655", "chitti@sim.com","IT") // Duplicate
        };

        // Contacts from Phone
        Contact1[] phoneContacts = {
            new Contact1( "Srinivas", "9876543210", "srinivas@sim.com","developer"),
            new Contact1( "Chityala", "9123456789", "chityala@sim.com","hr"),
            new Contact1( "Nivetha", "9123456789", "nivi@sim.com","IT")
        };

        Set<Contact1> uniqueContacts = new HashSet<>();
        Collections.addAll(uniqueContacts, simContacts);
        Collections.addAll(uniqueContacts, googleContacts);
        Collections.addAll(uniqueContacts, phoneContacts);

        List<Contact1> sortedContacts = new ArrayList<>(uniqueContacts);
        sortedContacts.sort(Comparator.comparing(Contact1::getName, String.CASE_INSENSITIVE_ORDER));

        // Optional: Group by department
        Map<String, List<Contact1>> groupedByDept = sortedContacts.stream()
                .collect(Collectors.groupingBy(Contact1::getDept));

        for (Map.Entry<String, List<Contact1>> entry : groupedByDept.entrySet()) {
            System.out.println("Department: " + entry.getKey());
            for (Contact1 contact : entry.getValue()) {
                System.out.println(" - " + contact);
            }
        }
    }
}
