package ch.bfh.cbs;

import java.math.BigDecimal;

public class DecimalNumbers {

    public static void main(String[] args) {

        float f1 = 3.3f;
        float f2 = 3.2f;

        double d1 = 3.3;
        double d2 = 3.2;

        BigDecimal b1 = new BigDecimal(3.3);
        BigDecimal b2 = new BigDecimal(3.2);


        System.out.println("Calculation: " + d1 + " / " + d2);
        System.out.println("Float:");
        System.out.println(f1 / f2);
        System.out.println("Double:");
        System.out.println(d1 / d2);
        System.out.println("BigDecimal:");
        System.out.println(b1.divide(b2, BigDecimal.ROUND_HALF_UP));
        System.out.println();
    }
}
