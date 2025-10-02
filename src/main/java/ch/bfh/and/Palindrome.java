package ch.bfh.and;

import java.util.Scanner;

public class Palindrome {

    static void main() {
      Scanner sc = new Scanner(System.in);


        System.out.println("enter a string to check if it's a palindrome");
        String check = sc.nextLine();
        boolean b = palindromeRecursive(check.replace(" ",""));
        System.out.println("is palindrome: " + b);


    }

    private static boolean palindromeRecursive(String s) {

        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return palindromeRecursive(s.substring(1, s.length() - 1));



    }
}
