package user;

public class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // toString method to represent user.Employee object as a string
    @Override
    public String toString() {
        return "user.Employee{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
