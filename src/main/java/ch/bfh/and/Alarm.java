package ch.bfh.and;


import java.util.Scanner;

public class Alarm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many");
        int b = sc.nextInt();

        alarm(1, b);
    }

    private static void alarm(int a, int b) {

        System.out.println(a + " is alarmed");

        if (a < b) {
            if (b - a == 1) {
                alarm(b, b);
            } else {
                int m = (a + b + 1) / 2;
                alarm(a + 1, m);
                alarm(m + 1, b);
            }

        }


    }

}
