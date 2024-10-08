import java.util.*;
public class TestIf3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Please enter a number 1 - 100 : ");
        int marks = sn.nextInt();

        if (marks > 100 || marks < 1) {
            System.out.println("Invalid!");
        } else if (marks < 50) {
            System.out.println("fail");
        } else if (marks < 60) {
            System.out.println("D Grade");
        } else if (marks < 70) {
            System.out.println("C Grade");
        } else if (marks < 80) {
            System.out.println("B Grade");
        } else if (marks < 90) {
            System.out.println("A Grade");
        } else {
            System.out.println("A+ Grade");
        }

    }
}
