package HustBookStore;

public class Employee {
    private String name;
    private String workingTime;
    private String role;
    private double salary;

    public Employee(String name, String workingTime, String role, double salary) {
        this.name = name;
        this.workingTime = workingTime;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getWorkingTime() {
        return workingTime;
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Working Time: " + workingTime);
        System.out.println("Salary: $" + salary);
    }
}