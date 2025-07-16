package day12;

import java.util.Vector;

class UsageRecord {
    String customerId;
    String type; // "CALL" or "SMS"
    long timestamp;

    public UsageRecord(String customerId, String type) {
        this.customerId = customerId;
        this.type = type;
        this.timestamp = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "[" + customerId + " - " + type + " @ " + timestamp + "]";
    }
}

class LoggerThread extends Thread {
    private final Vector<UsageRecord> log;
    private final String customerId;
    private final String type;

    public LoggerThread(Vector<UsageRecord> log, String customerId, String type) {
        this.log = log;
        this.customerId = customerId;
        this.type = type;
    }

    @Override
    public void run() {
        // Simulate multiple usage records per thread
        for (int i = 0; i < 5; i++) {
        	 UsageRecord record = new UsageRecord(customerId, type);
             log.add(record);  // Vector is synchronized
             System.out.println("Logged: " + record);

             try {
                 Thread.sleep(100); // Simulate processing time
             } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
             }
         }
     }
 }
        
