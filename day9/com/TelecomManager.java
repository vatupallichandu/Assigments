package day9.com;

import java.util.*;

public class TelecomManager {
    private Set<String> customers = new HashSet<>();
    private NavigableSet<String> blocked = new TreeSet<>();
    private Set<String> zones = new HashSet<>();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        String choice;
        do {
            System.out.println("\nChoose an action:");
            System.out.println("1. Add Customer");
            System.out.println("2. Block Number");
            System.out.println("3. Unblock Number");
            System.out.println("4. Add Network Zone");
            System.out.println("5. Show Summary");
            System.out.println("0. Exit");
            System.out.print("> ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter customer number: ");
                    String cust = scanner.nextLine().trim();
                    if (customers.add(cust))
                        System.out.println("Added customer: " + cust);
                    else
                        System.out.println("Customer already exists.");
                    break;
                case "2":
                    System.out.print("Enter number to block: ");
                    String bn = scanner.nextLine().trim();
                    if (blocked.add(bn))
                        System.out.println("Blocked: " + bn);
                    else
                        System.out.println("Number already blocked.");
                    break;
                case "3":
                    System.out.print("Enter number to unblock: ");
                    String ub = scanner.nextLine().trim();
                    if (blocked.remove(ub))
                        System.out.println("Unblocked: " + ub);
                    else
                        System.out.println("Number was not blocked.");
                    break;
                case "4":
                    System.out.print("Enter network zone ID: ");
                    String zone = scanner.nextLine().trim();
                    if (zones.add(zone))
                        System.out.println("Zone added: " + zone);
                    else
                        System.out.println("Zone already exists.");
                    break;
                case "5":
                    printSummary();
                    break;
                case "0":
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (!choice.equals("0"));
        scanner.close();
    }

    private void printSummary() {
        System.out.println("\n=== Summary ===");
        System.out.println("Customers (unordered): " + customers);
        System.out.println("Blocked Numbers (sorted): " + blocked);
        System.out.println("Zones (unordered): " + zones);
    }

    public static void main(String[] args) {
        new TelecomManager().start();
    }
}
