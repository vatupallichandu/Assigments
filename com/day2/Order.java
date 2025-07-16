package com.day2;

import java.util.Date;

class Order {
    String orderId;
    String[] items;
    Date timestamp;
    Order next;

    public Order(String orderId, String[] items) {
        this.orderId = orderId;
        this.items = items;
        this.timestamp = new Date();  // sets current time
        this.next = null;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.print("Items: ");
        for (String item : items) {
            System.out.print(item + " ");
        }
        System.out.println("\nTimestamp: " + timestamp);
        System.out.println("--------------");
    }
}
