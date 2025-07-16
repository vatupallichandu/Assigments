package com.day1;

import java.util.ArrayList;

public class WareHome {
    private ArrayList<String> productSlots = new ArrayList<>();

    public void storeProduct(int slot, String product) {
        while (productSlots.size() <= slot) {
            productSlots.add(null);
        }
        productSlots.set(slot, product);
    }

    public String getProduct(int slot) {
        if (slot >= 0 && slot < productSlots.size()) {
            String product = productSlots.get(slot);
            System.out.println(product);
            return product;
        } else {
            System.out.println("Error: Slot " + slot + " is out of bounds.");
            return null;
        }
    }

    public static void main(String[] args) {
        WareHouse warehouse = new WareHouse();
        warehouse.storeProduct(20, "zeera");
        warehouse.getProduct(20);
    }
}
