package day8;

import java.util.ArrayList;
import java.util.List;

// Define listener interface
interface MessageListener {
    void onMessageReceived(String message);
}

// Notification center holding listeners
class NotificationCenter {
    private List<MessageListener> listeners = new ArrayList<>();

    // Register a listener
    public void addListener(MessageListener listener) {
        listeners.add(listener);
    }

    // Remove a listener
    public void removeListener(MessageListener listener) {
        listeners.remove(listener);
    }

    // Store and notify
    public void notifyAll(String message) {
        System.out.println("NotificationCenter: New message -> " + message);
        for (MessageListener listener : listeners) {
            listener.onMessageReceived(message);
        }
    }
}




