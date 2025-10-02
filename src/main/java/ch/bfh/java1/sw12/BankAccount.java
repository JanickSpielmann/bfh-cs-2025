package ch.bfh.java1.sw12;

/**
 * A simple BankAccount class that assigns a unique account number to each new account.
 * Each account number is incremented from the last assigned number.
 * @author Janick Spielmann
 * @version 1.0
 * @since 2025-09-24
 */

public class BankAccount {
    private static int lastAccountNumber = 0; // please never do this!! <3
    private final int accountNumber;

    public BankAccount() {
        this.accountNumber = ++lastAccountNumber;
    }

    public int getLastAccountNumber() {
        return lastAccountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
