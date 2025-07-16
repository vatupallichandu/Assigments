package com.day2;

class OrderHistory {
    private Order head;

    public OrderHistory() {
        this.head = null;
    }

    // Add new order at the end
    public void addOrder(String orderId, String[] items) {
        Order newOrder = new Order(orderId, items);
        if (head == null) {
            head = newOrder;
        } else {
            Order current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newOrder;
        }
    }

    // Display all orders
    public void displayOrders() {
        if (head == null) {
            System.out.println("No orders found.");
            return;
        }
        Order current = head;
        while (current != null) {
            current.displayOrder();
            current = current.next;
        }
    }
}
