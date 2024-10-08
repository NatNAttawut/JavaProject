import java.lang.Math.*;
import java.util.*;

//import static java.lang.Math.PI;

class Shap{
    public void calArea(){
        System.out.println(" Result Area : ");
    }
}



public class OtherShap extends Shap {
    public double calArea(double width , double lenght){
        double square = width * lenght ;
        return square;
    }

    public double calArea(double Radius){
        double circle = Math.PI * Math.pow(Radius,2);
        return circle;
    }

    public double calArea(float Base , float Height){
        double triangle = 0.5 * Base * Height;
        return triangle;
    }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        OtherShap  shap = new OtherShap();

        System.out.print("กรอกความกว้าง : ");
        double width = sn.nextDouble();
        System.out.print("กรอกความยาว : ");
        double lenght = sn.nextDouble();
        double square = shap.calArea(width,lenght);

        System.out.print("กรอกรัศมีวงกลม : ");
        double Radius = sn.nextDouble();
        double circle = shap.calArea(Radius);

        System.out.print("กรอกความยาวฐาน : ");
        double Base = sn.nextDouble();
        System.out.print("กรอกความสูง : ");
        double Height = sn.nextDouble();
        double triangle = shap.calArea(Base,Height);

        System.out.println("พื้นที่สี่เหลี่ยม : " + String.format("%.2f" , square ));
        System.out.println("พื้นที่วงกลม : " + String.format("%.2f" , circle ));
        System.out.println("พื้นที่สามเหลี่ยม : " + String.format("%.2f" , triangle ));
//        System.out.printf( "grdfthgj" + "%.2f\n", triangle );

    }
}