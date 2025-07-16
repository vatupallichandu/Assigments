package com.day1;

import java.util.ArrayList;
import java.util.Arrays;

public class WeekDays {
    public static void main(String[] args) {
        // Initialize two lists of days
        ArrayList<String> week1 = new ArrayList<>(Arrays.asList(
            "Monday", "Tuesday", "Wednesday"));
        ArrayList<String> week2 = new ArrayList<>(Arrays.asList(
            "Thursday", "Friday", "Saturday", "Sunday"));

        // 1. addAll(): Combine week2 into week1
        week1.addAll(week2);
        System.out.println("After addAll: " + week1);
        // Expected: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]

        // 2. containsAll(): Check if week1 contains all of week2
        boolean hasFullWeek = week1.containsAll(week2);
        System.out.println("Contains all of week2? " + hasFullWeek);
        // Expected: true

        // 3. removeAll(): Remove weekend days
        ArrayList<String> weekend = new ArrayList<>(Arrays.asList("Saturday", "Sunday"));
        week1.removeAll(weekend);
        System.out.println("After removeAll(weekend): " + week1);
        // Expected: [Monday, Tuesday, Wednesday, Thursday, Friday]
    }
}

