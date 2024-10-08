import java.lang.*;
import java.util.*;
public class TestMath1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Plese Enter X and Y: ");
        int x = sn.nextInt();
        int y = sn.nextInt();
        int Max  = Math.max(x,y);

        if (Max == x){
            System.out.println("X > Y = " + Max);
        }
        else {
            System.out.println("Y > X = " + Max);
        }

    }
}
