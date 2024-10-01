package user;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int age;
    private int loyaltyPoints;
    private List<String> preferences; // New field to store user preferences

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.loyaltyPoints = 0;
        this.preferences = new ArrayList<>(); // Initialize preferences list
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    // Getters and setters for preferences
    public List<String> getPreferences() {
        return preferences;
    }

    public void setPreferences(List<String> preferences) {
        this.preferences = preferences;
    }

    // Method to add a preference
    public void addPreference(String preference) {
        preferences.add(preference);
    }

    // toString method to represent user.User object as a string
    @Override
    public String toString() {
        return "user.User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", loyaltyPoints=" + loyaltyPoints +
                ", preferences=" + preferences +
                '}';
    }
}
