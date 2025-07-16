package day9.com;


import java.util.LinkedHashSet;
import java.util.Set;

public class ContactManager {
    private Set<Contact> contacts = new LinkedHashSet<>();

    /** Returns true if contact was newly added */
    public boolean add(Contact c) {
        return contacts.add(c); // false on duplicate
    }

    public void list() {
        System.out.println("Contacts in insertion order:");
        for (Contact c : contacts) {
            System.out.println("  " + c);
        }
    }

    public static void main(String[] args) {
        ContactManager cm = new ContactManager();

        System.out.println(cm.add(new Contact("Anand", "1234", "a@x.com"))); // true
        System.out.println(cm.add(new Contact("chandu",   "5678", "b@x.com"))); // true
        System.out.println(cm.add(new Contact("Anand", "1234", "a@x.com"))); // false (duplicate)
        System.out.println(cm.add(new Contact("Ramya",   "1234", "e@x.com"))); // true

        cm.list();
    }
}

