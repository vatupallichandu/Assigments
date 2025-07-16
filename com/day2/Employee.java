package com.day2;

import java.util.*;
import java.util.concurrent.*;

class Employee implements Comparable<Employee> {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }

    @Override
    public int compareTo(Employee other) {
        return this.id - other.id; // for PriorityQueue: lower ID gets higher priority
    }
}

