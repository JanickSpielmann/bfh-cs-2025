package ch.bfh.and;

public class AlgLoop {

    static void main() {

        double t =  System.currentTimeMillis();
        task11(80);

        System.out.println((System.currentTimeMillis()-t)/1000);
    }

    static void task11(double i) {

       int s = 0;
       for (int j=1;j<Math.pow(i,2);j++) {
           s += j;

           if(s%2 != 0){
               for (int k=j;k<Math.pow(j,2);k++) {
                   s -= k;
               }
               System.out.println("loadingOdd");
           }
           else{
               for (int k=j;k<j+100;k++) {
                   s += k;
               }
               System.out.println("loadingEven");
           }

       }

    }
}
