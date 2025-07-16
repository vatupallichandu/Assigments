package day12;

import java.util.Vector;

public class UsageLogger {
    public static void main(String[] args) {
        Vector<UsageRecord> usageLog = new Vector<>();

        // Create threads simulating multiple customers
        Thread t1 = new LoggerThread(usageLog, "CUST001", "CALL");
        Thread t2 = new LoggerThread(usageLog, "CUST002", "SMS");
        Thread t3 = new LoggerThread(usageLog, "CUST003", "CALL");
        Thread t4 = new LoggerThread(usageLog, "CUST004", "SMS");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }

        // Final usage log size
        System.out.println("\nTotal records logged: " + usageLog.size());
    }
}
        
