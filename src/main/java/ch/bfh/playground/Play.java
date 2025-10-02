package ch.bfh.playground;


public class Play {

    public static void main(String[] args) {
        System.out.println("Hello, Playground!");
        int coutner = 0;


        boolean condition = true; // also known as flag, switch or guard.

        while (coutner <= 10) {
            System.out.println(coutner);

            if(condition) {
                condition = false;
                coutner++;

            }
            coutner ++;
        }
        System.out.println("End of program.");



    }


}
