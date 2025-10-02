package ch.bfh.java1.sw34;

/**
 * This class represents an Employee with a name and a salary.
 * It provides methods to get the employee's name and salary,
 * as well as to raise the salary by a given percentage.
 * <p>
 * We are no longer working with main methods inside the same package,
 * but with Unit Tests (see main/test/java/ch/bfh/sw34/EmployeeTest.java)
 *
 * @author Janick Spielmann
 * @version 1.0
 * @since 2025-09-18
 */
public class Employee {

    private final String name;
    private double salary;

    /**
     * Constructor to initialize the employee's name and current salary.
     * @param employeeName the name of the employee
     * @param currentSalary the current salary of the employee
     */
    public Employee(String employeeName, double currentSalary) {
        this.name = employeeName;
        this.salary = currentSalary;
    }

    /**
     * Raises the salary by a given percentage.
     * @param byPercent the percentage to raise the salary by
     */
    public void raiseSalary(double byPercent) {
        salary = salary * (1 + byPercent / 100);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
