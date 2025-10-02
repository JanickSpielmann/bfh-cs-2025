package ch.bfh.and;

import java.util.Scanner;

public class Prefix {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a string to check if it's a prefix");
        String s = sc.nextLine();
        System.out.println("enter a string to check against");
        String t = sc.nextLine();

        boolean isPrefix = isPrefixRecorsive(s, t);

        System.out.println("is prefix: " + isPrefix);
    }

    private static boolean isPrefixRecorsive(String s, String t) {

        if (s.length() == 0) {
            return true;
        }
        if (t.length() == 0) {
            return false;
        }
        if (s.charAt(0) != t.charAt(0)) {
            return false;
        }
        return isPrefixRecorsive(s.substring(1), t.substring(1));
    }
}
