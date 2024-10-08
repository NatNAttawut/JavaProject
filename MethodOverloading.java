import java.util.*;
import java.math.*;


public class MethodOverloading {
    static double Volume(double width, double lenght, double height) {
        return width * lenght * height;
    }

    static double Volume(double Radius) {
        return (4.0/3.0) * Math.PI * Math.pow(Radius,3);
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Width = ");
        double width = sn.nextDouble();

        System.out.print("Lenght = ");
        double lenght = sn.nextDouble();

        System.out.print("Height = ");
        double height = sn.nextDouble();

        System.out.print("Radius = ");
        double Radius = sn.nextDouble();

        double RectangleArea = Volume(width, lenght, height);
        System.out.println("Square Area : " + RectangleArea);

        double CircleArea = Volume(Radius);
        System.out.println("Circle Area : " + CircleArea);
    }
}