package day12;



import java.util.ArrayList;
 
class CallRecord {
    String caller;
    String receiver;
    int duration;
 
    public CallRecord(String caller, String receiver, int duration) {
        this.caller = caller;
        this.receiver = receiver;
        this.duration = duration;
    }
 
    public void display() {
        System.out.println("Caller: " + caller + ", Receiver: " + receiver + ", Duration: " + duration + " sec");
    }
}
 
