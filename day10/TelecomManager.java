package day10;
import java.util.*;

class Plan {
    private String code;
    private String name;
    private double price;

    public Plan(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }
    public String getCode() { return code; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    @Override public String toString() {
        return String.format("%s [%s]: ₹%.2f", name, code, price);
    }
}

class Customer {
    private String id;
    private String name;
    private Plan plan;

    public Customer(String id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }
    public String getId() { return id; }
    public String getName() { return name; }
    public Plan getPlan() { return plan; }
}

public class TelecomManager {
    // planCode -> Plan, unordered lookup
    private Map<String, Plan> planCatalog = new HashMap<>();
    // customerId -> Customer, insertion order
    private Map<String, Customer> customers = new LinkedHashMap<>();
    // sorted by customer name
    private Map<String, Customer> customersByName = new TreeMap<>();

    public void addPlan(Plan p) {
        planCatalog.put(p.getCode(), p);
    }

    public void addCustomer(Customer c) {
        if (!planCatalog.containsKey(c.getPlan().getCode())) {
            throw new IllegalArgumentException("Plan doesn't exist");
        }
        customers.put(c.getId(), c);
        customersByName.put(c.getName(), c);
    }

    public void showPlans() {
        System.out.println("\nAvailable plans:");
        planCatalog.forEach((code,p) -> System.out.println(" - " + p));
    }

    public void showCustomersByJoinOrder() {
        System.out.println("\nCustomers (join order):");
        customers.forEach((id,c) ->
            System.out.println(" - " + c.getName() + " ("+id+"): " + c.getPlan()));
    }

    public void showCustomersSortedByName() {
        System.out.println("\nCustomers (sorted by name):");
        customersByName.forEach((name, c) ->
            System.out.println(" - " + name + " ("+c.getId()+"): " + c.getPlan()));
    }

    public static void main(String[] args) {
        TelecomManager tm = new TelecomManager();

        // 1. Add plans
        tm.addPlan(new Plan("P100", "Basic 100 SMS", 99.0));
        tm.addPlan(new Plan("P200", "Unlimited Voice", 299.0));
        tm.addPlan(new Plan("P300", "Data 5GB", 499.0));

        tm.showPlans();

        // 2. Add customers
        tm.addCustomer(new Customer("C001", "Rajini", tm.planCatalog.get("P200")));
        tm.addCustomer(new Customer("C002", "Anand", tm.planCatalog.get("P100")));
        tm.addCustomer(new Customer("C003", "Sravan", tm.planCatalog.get("P300")));

        tm.showCustomersByJoinOrder();
        tm.showCustomersSortedByName();

        // 3. Update a customer's plan
        Customer rajini= tm.customers.get("C001");
        System.out.println("\nUpdating plan for " + rajini.getName());
        tm.addCustomer(new Customer("C001", "Rajini", tm.planCatalog.get("P300")));

        tm.showCustomersByJoinOrder();
    }
}
