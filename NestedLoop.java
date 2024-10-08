import java.util.*;
public class NestedLoop {
    public static void main(String[] args) {
        for(int i = 1 ; i<=2 ; i++ ){
            System.out.println("Outer: " + i);
            for (int a = 1 ; a <= 3 ; a++){
                System.out.println(" Inner : " + a);
            }
        }
    }
}
