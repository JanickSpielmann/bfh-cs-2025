package ch.bfh.java1.sw12;

/**
 * This class and all other classes named *Test
 * are usually located in main/test/java/.../...
 * <p>
 * It demonstrates the functionality of the Counter class by creating an instance,
 * counting up, resetting, and printing the current value.
 *
 * @author Janick Spielmann
 * @version 1.0
 * @since 2025-09-17
 *
 */

public class CounterTest {

    public static void main(String[] args) { // String args is used to give values from command line
        Counter counter = new Counter(); // We create a new Object of type Counter
        System.out.println(counter.getValue() + ", expected 0"); // We print the current value of the counter
        counter.countUp(); // We call the countUp method to increase the counter by 1
        counter.countUp();
        System.out.println(counter.getValue() + ", expected 2");
        counter.reset();
        System.out.println(counter.getValue() + ", expected 0");
    }
}
