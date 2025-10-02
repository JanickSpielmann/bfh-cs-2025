package ch.bfh.java1.sw12;

/**
 * A simple counter class that can be incremented, reset, and initialized with a specific value.
 *
 * @version 1.0
 * @author Janick Spielmann
 * @since 2025-09-17
 */

public class Counter {

    private int value; // Variable to hold the current count value

    /**
     * Default constructor to initialize the counter to 0
     */
    public Counter() {
        value = 0; // Initialize count to 0
    }

    /**
     * Overloaded constructor to initialize the counter to a specific value
     * @param value the initial value of the counter
     */
    public Counter(int value) {
        this.value = value;
    }

    /**
     * Method to increment the counter by 1
     */
    public void countUp() {
        value = value + 1; // more common is value++
    }

    /**
     * get the current value of the counter
     * @return the current count value
     */
    public int getValue() {
        return value;
    }

    /**
     * reset the counter to 0
     */
    public void reset() {
        value = 0;
    }

    /**
     * reset the counter to a specific value
     * @param value the value to reset the counter to
     */
    public void reset(int value) {
        this.value = value;
    }
}
