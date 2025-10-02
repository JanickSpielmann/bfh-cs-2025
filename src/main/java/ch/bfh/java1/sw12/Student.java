package ch.bfh.java1.sw12;

/**
 * Student class with overloaded constructors and method to print student info.
 *
 * @author Janick Spielmann
 * @version 1.0
 * @since 2025-09-17
 */

public class Student {

    private static int studentCounter = 0; // please never do this!! <3
    private final String name;
    private final String lastName;
    private int age;

    /**
     * Constructor with all parameters
     *
     * @param name     surname of the student
     * @param lastName last name of the student
     * @param age      age of the student
     */
    public Student(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        studentCounter++;
    }

    /**
     * Constructor with default age of 23
     *
     * @param name prename of the student
     * @param lastName last name of the student
     */
    public Student(String name, String lastName) {
        this(name, lastName, 0);
    }

    /**
     * Method to print student information
     */
    public void printStudentInfo() {
        System.out.println(name + " " + lastName + " is " + age + " years old.");
    }


    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Shows how many Students have been created
     *
     * @return number of students
     */
    public static int getStudentCounter() {
        return studentCounter;
    }
}
