import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class TryCatch {
    public static void main(String[] args) {
    double r = 0d ;
    Scanner sn = new Scanner(System.in);
    System.out.print("Please Enter : ");
    try {
        r = sn.nextDouble();
    }
    catch (InputMismatchException s){
        String a = sn.nextLine();
        System.out.println("i don't know :  " + a);
    }
        System.out.println("Radius: " + r);
        System.out.println("Circle Area : " + 3.14 * r * r);
        System.out.println("Circumference Length : " + 2 * 3.14 * r);
    }
}
