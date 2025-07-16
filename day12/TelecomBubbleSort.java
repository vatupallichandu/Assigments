package day12;

import java.util.ArrayList;

public class TelecomBubbleSort {
	 
    public static void bubbleSort(ArrayList<CallRecord> records) {
        int n = records.size();
        boolean swapped;
 
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
 
            for (int j = 0; j < n - i - 1; j++) {
                if (records.get(j).duration > records.get(j + 1).duration) {
                    CallRecord temp = records.get(j);
                    records.set(j, records.get(j + 1));
                    records.set(j + 1, temp);
                    swapped = true;
                }
            }
 
            if (!swapped)
                break;
        }
    }
 
    public static void main(String[] args) {
        ArrayList<CallRecord> records = new ArrayList<>();
 
        records.add(new CallRecord("User1", "User2", 180));
        records.add(new CallRecord("User3", "User4", 60));
        records.add(new CallRecord("User2", "User1", 240));
        records.add(new CallRecord("User5", "User3", 120));
 
        System.out.println("Call Records Before Sorting:");
        for (CallRecord r : records)
            r.display();
 
        bubbleSort(records);
 
        System.out.println("\nCall Records After Sorting by Duration:");
        for (CallRecord r : records)
            r.display();
    }
}
 
 

