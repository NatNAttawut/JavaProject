import java.util.*;
public class TestIf2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int num = sn.nextInt();

        if (num > 10 || num < 1) {
            System.out.println("Please enter a number 1 - 10.");
            }
        else if(num>5){
            System.out.println("num more than 5");
        }
        else if(num<5){
            System.out.println("num less than 5");
        }
        else{
            System.out.println("num = 5");
        }
    }
}
