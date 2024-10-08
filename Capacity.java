import java.util.*;
import java.lang.Math.*;


class Capacity {
    final double PI = 3.14;
    private double capacity;

    public Capacity() {
        this.capacity = 0;
    }

    public double getCapacity(double Radius) {
        capacity = (4.0 / 3.0) * PI * Math.pow(Radius, 3);
        return capacity;
    }

    public double getCapacity(double width, double length, double height) {
        capacity = width * length * height;
        return capacity;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Capacity cap = new Capacity();

        System.out.print("กรอกรัศมีวงกลม : ");
        double Radius = sn.nextDouble();
        double Circle = cap.getCapacity(Radius);


        System.out.print("กรอกความกว้าง : ");
        double width = sn.nextDouble();
        System.out.print("กรอกความยาว : ");
        double lenght = sn.nextDouble();
        System.out.print("กรอกความสูง : ");
        double height = sn.nextDouble();
        double Square = cap.getCapacity(width,lenght,height);


        System.out.println("ปริมาตรทรงสี่เหลี่ยม: " + Square);
        System.out.println("ปริมาตรทรงกลม: " + Circle);
    }
}
