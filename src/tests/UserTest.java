package tests;

import org.junit.Test;
import user.User;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void testUserCreation() {
        String name = "John Doe";
        int age = 25;
        User user = new User(name, age);

        assertEquals(name, user.getName());
        assertEquals(age, user.getAge());
        assertEquals(0, user.getLoyaltyPoints());
        assertEquals(0, user.getPreferences().size());
    }

    @Test
    public void testSetterMethods() {
        User user = new User("John Doe", 25);

        String newName = "Jane Smith";
        int newAge = 30;
        int newLoyaltyPoints = 100;
        List<String> newPreferences = Arrays.asList("Action", "Comedy");

        user.setName(newName);
        user.setAge(newAge);
        user.setLoyaltyPoints(newLoyaltyPoints);
        user.setPreferences(newPreferences);

        assertEquals(newName, user.getName());
        assertEquals(newAge, user.getAge());
        assertEquals(newLoyaltyPoints, user.getLoyaltyPoints());
        assertEquals(newPreferences, user.getPreferences());
    }

    @Test
    public void testAddPreference() {
        User user = new User("John Doe", 25);

        String preference1 = "Action";
        String preference2 = "Comedy";

        user.addPreference(preference1);
        user.addPreference(preference2);

        assertEquals(2, user.getPreferences().size());
        assertEquals(preference1, user.getPreferences().get(0));
        assertEquals(preference2, user.getPreferences().get(1));
    }
}
