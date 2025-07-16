package day9.com;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class User {
    private final String name;
    private final Set<String> interests;

    public User(String name) {
        this.name = name;
       // this.interests = new HashSet<>();
        this.interests=new TreeSet<>();
    }

    /** Adds an interest; returns true if it was new, false if duplicate */
    public boolean addInterest(String interest) {
        return interests.add(interest);
    }

    public boolean hasInterest(String interest) {
        return interests.contains(interest);
    }

    public void removeInterest(String interest) {
        interests.remove(interest);
    }

    public Set<String> getInterests() {
        return Set.copyOf(interests); // Immutable snapshot
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', interests=" + interests + '}';
    }

    public static void main(String[] args) {
        User user = new User("Alice");

        System.out.println(user.addInterest("pizza"));   // true
        System.out.println(user.addInterest("burger"));   // true
        System.out.println(user.addInterest("punugulu")); // true
        System.out.println(user.addInterest("pizza"));   // false (duplicate)

        System.out.println("All interests: " + user.getInterests());
    }
}
