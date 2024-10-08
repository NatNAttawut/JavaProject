import java.util.*;
public class Square {
    public int width;
    public int length;
    static void squareArea(int x, int y){
        System.out.println("Square Area: "+(x*y));
    }
    static void squareCircumArea(int x, int y){
        System.out.println("Square Area: "+ ((2*x)+(2*y)));
    }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Square s = new Square();
        try{
            System.out.print("Input width: ");
            s.width = sn.nextInt();
            System.out.print("Input length: ");
            s.length = sn.nextInt();
            squareArea(s.width,s.length);
            squareCircumArea(s.width,s.length);

        } catch (InputMismatchException e){
            System.out.println("Input Error!!!");
        }

    }
}