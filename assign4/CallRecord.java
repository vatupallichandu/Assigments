package com.assign4;

public class CallRecord {
	private String phoneNumber;
    private int duration;
 
    public CallRecord(String phoneNumber, int duration) {
        this.phoneNumber = phoneNumber;
        this.duration = duration;
    }
 
    @Override
    public String toString() {
        return "Called: " + phoneNumber + ", Duration: " + duration + " sec";
    }
 
 
}
 
