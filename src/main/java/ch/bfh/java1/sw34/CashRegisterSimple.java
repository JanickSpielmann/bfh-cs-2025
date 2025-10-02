package ch.bfh.java1.sw34;

/**
 * A simple cash register that totals up purchases and totals up change.
 * It also provides a method to convert dollars to quarters.
 *
 * @author Janick Spielmann
 * @version 1.0
 * @since 2025-09-18
 */
public class CashRegisterSimple {

    // Constants for coin values
    public static final double PENNY_VALUE = 0.01;
    public static final double NICKEL_VALUE = 0.05;
    public static final double DIME_VALUE = 0.10;
    public static final double QUARTER_VALUE = 0.25;

    // Instance variables
    private double purchase;
    private double payment;

    /**
     * Record purchase of an item.
     *
     * @param amount price of the item
     */
    public void recordPurchase(double amount) {
        purchase += amount;
    }

    /**
     * Process cash payment
     *
     * @param dollar numbers of dollars
     * @param quarters numbers of quarters
     * @param dimes   numbers of dimes
     * @param nickels numbers of nickels
     * @param pennies numbers of pennies
     */
    public void payCash(int dollar, int quarters, int dimes, int nickels, int pennies) {
        this.payment = dollar + QUARTER_VALUE * quarters + DIME_VALUE * dimes + NICKEL_VALUE * nickels + PENNY_VALUE * pennies;
    }

    /**
     * Finish purchase and return change
     *
     * @return change due to customer
     */
    public double giveChange() {
        double change = payment - purchase;
        purchase = 0.0;
        payment = 0.0;
        return change;
    }

    /**
     * change dollars to quarters
     *
     * @param dollars amount in dollars to change
     * @return numbers of quarters
     */
    public double changeToQuarters(int dollars) {
        return dollars / 0.25;
    }
}
