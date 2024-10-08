import java.util.*;

public class TaxCalculate {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int[] num = new int[10];
        double[] a = new double[10];

        for (int i = 0; i < 10; i++) {
            try {
                int c = i + 1;
                System.out.print("Enter Number["+ c + "] : ");
                num[i] = sn.nextInt();

                double tax = 0;
                int Total = num[i];

                if (Total > 4000000) {
                    tax = Total * 0.37;
                } else if (Total >= 1000000) {
                    tax = Total * 0.30;
                } else if (Total >= 500000) {
                    tax = Total * 0.20;
                } else if (Total >= 100000) {
                    tax = Total * 0.10;
                } else if (Total > 0) {
                    tax = Total * 0.05;
                }
                a[i] = tax;
            }

            catch (InputMismatchException e) {
                System.out.println("The information is incorrect. Please enter numeric information.");
                sn.next();
                i--;
            }
        }


        System.out.println("Total Amount and Tax :");
        for (int i = 0; i < 10; i++) {
            int b = i + 1;
            System.out.println("Total Amount[" + b + "] : " + num[i]);
            System.out.println("Tax[" + b + "] : " + a[i]);
            System.out.println();
        }
    }
}
