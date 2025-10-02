package ch.bfh.java1.sw34;

/**
 * A simple class to demonstrate string manipulation methods.
 * This class includes methods to edit Strings in various ways.
 *
 * @author Janick Spielmann
 * @version 1.0
 * @since 2025-09-18
 */
public class StringReader {

    /**
     * Cuts the first letter from the input string.
     *
     * @param input the input string
     * @return the input string without its first letter
     */
    public String cutFirstLetter(String input) {
        return input.substring(1);
    }

    /**
     * Converts the input string to upper case.
     *
     * @param input the input string
     * @return the upper case version of the input string
     */
    public String convertToUpperCase(String input) {
        return input.toUpperCase();
    }

    /**
     * Replaces all occurrences of 'a' with 'z' and 'A' with 'Z' in the input string.
     *
     * @param input the input string
     * @return the modified string with 'a' replaced by 'z' and 'A' replaced by 'Z'
     */
    public String replaceAWithZ(String input) {
        return input.replace('a', 'z').replace('A', 'Z');
    }

    /**
     * Adds the text "-ready!" to the end of the input string.
     *
     * @param input the input string
     * @return the input string with "-ready!" appended
     */
    public String addTextToString(String input) {
        return input + "-ready!";
    }
}
