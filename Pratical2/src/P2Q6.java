
import java.util.Scanner;

public class P2Q6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Number    SquareRoot");

        for (int i = 0; i <= 20; i++) {

            System.out.printf("%-9d %.4f\n", i, sqrt(i));

        }

    }

    public static double sqrt(double x) {

        double l=0, u=0;
        double mid, smid;

        if (x == 0 || x == 1) {
            return x;
        } else if (x < 0) {
            System.out.println("Error:.......");
            System.exit(-1);
        } else if (x > 1) {
            l = 1;
            u = x;
        } else {
            //x<1 && x>0
            u = 1;
            l = x;
        }

        while ( Math.abs((l-u)/l) >= 1.0e-8) {
            mid = (l + u) / 2;
            smid = mid * mid;

            if (smid > x) {
                u = mid;
            } else {
                l = mid;
            }
        }
        return(l+u)/2.0;
    }
    
}
