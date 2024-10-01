package tests;

import org.junit.Test;
import user.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void testEmployeeCreation() {
        String name = "John Doe";
        String role = "Manager";
        Employee employee = new Employee(name, role);

        assertEquals(name, employee.getName());
        assertEquals(role, employee.getRole());
    }

    @Test
    public void testSetterMethods() {
        Employee employee = new Employee("John Doe", "Manager");

        String newName = "Jane Smith";
        String newRole = "Assistant";

        employee.setName(newName);
        employee.setRole(newRole);

        assertEquals(newName, employee.getName());
        assertEquals(newRole, employee.getRole());
    }
}
