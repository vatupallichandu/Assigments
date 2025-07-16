package day12;

public class TelecomUsageSorter {

    // Bubble sort method to sort customer usage counts
    public static void bubbleSort(int[] usageCounts) {
        int n = usageCounts.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (usageCounts[j] > usageCounts[j + 1]) {
                    // Swap
                    int temp = usageCounts[j];
                    usageCounts[j] = usageCounts[j + 1];
                    usageCounts[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        // Example usage counts (e.g., calls made by customers)
        int[] usageCounts = {45, 12, 78, 34, 89, 23, 56};

        System.out.println("Customer usage counts before sorting:");
        for (int count : usageCounts) {
            System.out.print(count + " ");
        }

        // Sort the usage counts
        bubbleSort(usageCounts);

        System.out.println("\nCustomer usage counts after sorting:");
        for (int count : usageCounts) {
            System.out.print(count + " ");
        }
    }
}