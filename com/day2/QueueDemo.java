package com.day2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) throws InterruptedException {
        Employee emp1 = new Employee(3, "Alice");
        Employee emp2 = new Employee(1, "Bob");
        Employee emp3 = new Employee(2, "Charlie");

        System.out.println("1️⃣ LinkedList as Queue:");
        Queue<Employee> linkedListQueue = new LinkedList<>();
        linkedListQueue.offer(emp1);
        linkedListQueue.offer(emp2);
        linkedListQueue.offer(emp3);
        while (!linkedListQueue.isEmpty()) {
            linkedListQueue.poll().display();
        }

        System.out.println("\n2️⃣ ArrayDeque:");
        Deque<Employee> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(emp1);
        arrayDeque.offer(emp2);
        arrayDeque.offer(emp3);
        while (!arrayDeque.isEmpty()) {
            arrayDeque.poll().display();
        }

        System.out.println("\n3️⃣ PriorityQueue (by ID):");
        PriorityQueue<Employee> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(emp1);
        priorityQueue.offer(emp2);
        priorityQueue.offer(emp3);
        while (!priorityQueue.isEmpty()) {
            priorityQueue.poll().display();
        }

        System.out.println("\n4️⃣ BlockingQueue (LinkedBlockingQueue):");
        BlockingQueue<Employee> blockingQueue = new LinkedBlockingQueue<>();
        blockingQueue.put(emp1);
        blockingQueue.put(emp2);
        blockingQueue.put(emp3);
        while (!blockingQueue.isEmpty()) {
            blockingQueue.take().display();
        }

        System.out.println("\n5️⃣ ConcurrentLinkedQueue:");
        Queue<Employee> concurrentQueue = new ConcurrentLinkedQueue<>();
        concurrentQueue.offer(emp1);
        concurrentQueue.offer(emp2);
        concurrentQueue.offer(emp3);
        while (!concurrentQueue.isEmpty()) {
            concurrentQueue.poll().display();
        }
    }
}

