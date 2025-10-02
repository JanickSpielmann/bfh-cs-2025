package ch.bfh.and;

public class AlgLoop {


    public static void main(String[] args) {

        double t = System.currentTimeMillis();
        task11(20);

        System.out.println((System.currentTimeMillis() - t) / 1000);
    }

    static void task11(int i) {

        int s = 0;
        for (int j = 1; j < i * i; j++) {
            s += j;

            if (s % 2 != 0) {
                for (int k = j; k < j * j; k++) {
                    s -= k;
                }
                System.out.println("loadingOdd");
            } else {
                for (int k = j; k < (j + 100); k++) {
                    s += k;
                }
                System.out.println("loadingEven");
            }

        }

    }
}
