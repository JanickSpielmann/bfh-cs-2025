package ch.bfh.java1.sw12;

/**
 * Test class for the Student class.
 * Demonstrates the creation of Student objects and the use of static methods.
 * @author Janick Spielmann
 * @version 1.0
 * @since 2025-09-17
 */


public class StudentTest {
    public static void main(String[] args) {

        System.out.println("We got " + Student.getStudentCounter() + " students");
        Student john = new Student("John", "Smith", 22);
        System.out.println("We got " + Student.getStudentCounter() + " students");
        Student jim = new Student("Jim", "Foo");
        System.out.println("We got " + Student.getStudentCounter() + " students");
        jim.setAge(23);

        john.printStudentInfo();
        jim.printStudentInfo();
    }
}
