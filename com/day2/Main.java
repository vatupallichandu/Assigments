package com.day2;



public class Main {
    public static void main(String[] args) {
        OrderHistory history = new OrderHistory();

        history.addOrder("001", new String[]{"Laptop", "Mouse"});
        history.addOrder("002", new String[]{"Phone"});
        history.addOrder("003", new String[]{"Tablet", "Charger"});

        history.displayOrders();
    }
}
