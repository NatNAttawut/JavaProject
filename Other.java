import java.util.Scanner;

public class Other {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int[] num = new int[10];
        double[] taxes = new double[10]; // Array to store calculated taxes

        // Input and tax calculation
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Number : ");
            num[i] = sn.nextInt();

            double tax = 0; // Variable to store tax amount
            int income = num[i]; // Current income

            // Calculate tax based on income
            if (income > 4000000) {
                tax = income * 0.37;
            } else if (income >= 1000000) {
                tax = income * 0.30;
            } else if (income >= 500000) {
                tax = income * 0.20;
            } else if (income >= 100000) {
                tax = income * 0.10;
            } else if (income > 0) {
                tax = income * 0.05;
            }

            taxes[i] = tax;
        }
        sn.close();

        System.out.println("\nIncome and Tax Report:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Income: " + num[i] + " - Tax: " + taxes[i]);
        }
    }
}
