package ch.bfh.java1.sw34;

import java.math.BigDecimal;

/**
 * This class represents an extended cash register that can handle purchases and payments
 * using BigDecimal for precise monetary calculations. It supports recording purchases,
 * processing cash payments in various denominations, and calculating change due to the customer.
 *
 * @author Janick Spielmann
 * @version 1.0
 * @since 2025-09-18
 */

public class ExtendedCashRegister {

    /**
     * Values of US coins in BigDecimal
     */
    public static final BigDecimal PENNY_VALUE = BigDecimal.valueOf(0.01);
    public static final BigDecimal NICKEL_VALUE = BigDecimal.valueOf(0.05);
    public static final BigDecimal DIME_VALUE = BigDecimal.valueOf(0.10);
    public static final BigDecimal QUARTER_VALUE = BigDecimal.valueOf(0.25);

    private BigDecimal purchase = BigDecimal.ZERO;
    private BigDecimal payment = BigDecimal.ZERO;

    /**
     * Record purchase of an item. As BigDecimal cannot be changed, it has to be overwritten.
     * += or add() does not work.
     *
     * @param amount price of the item
     */
    public void recordPurchase(double amount) {
        purchase = purchase.add(BigDecimal.valueOf(amount));
    }

    /**
     * Process cash payment
     *
     * @param dollars  numbers of dollars
     * @param quarters numbers of quarters
     * @param dimes    numbers of dimes
     * @param nickels  numbers of nickels
     * @param pennies  numbers of pennies
     */
    public void payCash(int dollars, int quarters, int dimes, int nickels, int pennies) {
        payment = BigDecimal.valueOf(dollars).add(QUARTER_VALUE.multiply(BigDecimal.valueOf(quarters))).add(DIME_VALUE.multiply(BigDecimal.valueOf(dimes))).add(NICKEL_VALUE.multiply(BigDecimal.valueOf(nickels))).add(PENNY_VALUE.multiply(BigDecimal.valueOf(pennies)));
    }

    /**
     * Finish purchase and return change
     *
     * @return change due to customer
     */
    public BigDecimal giveChange() {
        BigDecimal change = payment.subtract(purchase);
        purchase = BigDecimal.ZERO; // BigDecimal.valueOf(0.0) also works
        payment = BigDecimal.ZERO;
        return change;
    }

    /**
     * change dollars to quarters
     *
     * @param dollars amount in dollars to change
     * @return numbers of quarters
     */
    public int changeToQuarters(int dollars) {
        return dollars * 4;
    }

    public void payDollars(double dollars) {
        payment = payment.add(BigDecimal.valueOf(dollars));
    }

    public void payQuarters(int quarters) {
        payment = payment.add(QUARTER_VALUE.multiply(BigDecimal.valueOf(quarters)));
    }

    public void payDimes(int dimes) {
        payment = payment.add(DIME_VALUE.multiply(BigDecimal.valueOf(dimes)));
    }

    public void payNickels(int nickels) {
        payment = payment.add(NICKEL_VALUE.multiply(BigDecimal.valueOf(nickels)));
    }

    public void payPennies(int pennies) {
        payment = payment.add(PENNY_VALUE.multiply(BigDecimal.valueOf(pennies)));
    }
}


