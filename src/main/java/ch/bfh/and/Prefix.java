package ch.bfh.and;

import java.util.Scanner;

public class Prefix {

    private Prefix() {
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a string to check if it's a prefix");
        String s = sc.nextLine();
        System.out.println("enter a string to check against");
        String t = sc.nextLine();

        boolean isPrefix = isPrefixRecursive(s, t);

        System.out.println("is prefix: " + isPrefix);
    }

    private static boolean isPrefixRecursive(String s, String t) {

        if (s.length() == 0) {
            return true;
        }
        if (t.length() == 0) {
            return false;
        }
        if (s.charAt(0) != t.charAt(0)) {
            return false;
        }
        return isPrefixRecursive(s.substring(1), t.substring(1));
    }
}
