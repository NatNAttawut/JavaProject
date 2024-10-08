import java.util.*;

public class TemCalculate {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        double[] TempS = new double[10];
        double[] TempF = new double[10];


        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Temperature in Celsius[" + (i + 1) + "]: ");
            TempS[i] = sn.nextDouble();

            TempF[i] = (TempS[i] * 1.8) + 32;
        }


        double maxTemp = TempF[0];
        double minTemp = TempF[0];

        for (int i = 1; i < 10; i++) {
            if (TempF[i] > maxTemp) {
                maxTemp = TempF[i];
            }
            if (TempF[i] < minTemp) {
                minTemp = TempF[i];
            }
        }


        System.out.println("\nTemperature Report:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Degrees Celsius[" + (i + 1) + "]: " + TempS[i] );
            System.out.println("Degrees Fahrenheit[" + (i + 1) + "]: " + TempF[i]);
            System.out.println();
            System.out.println();
        }

        System.out.println("Maximum Temperature in Fahrenheit: " + maxTemp);
        System.out.println("Minimum Temperature in Fahrenheit: " + minTemp);
        System.out.println();
    }
}

