/**
 * Created by Praneeth on 8/14/2016.
 */
public class FibonacciGen {

    public static void main(String[] args) {
        int f1 = 1;
        int f2 = 1;
        int f3 = f1 + f2;
        int count = 0;

        System.out.print(f1 + " ");
        System.out.print(f2 + " ");

        while (count < 20) {
            System.out.print(f3  + " ");
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
            count++;


        }


    }
}
