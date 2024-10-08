import java.util.ArrayList;
import java.lang.*;
import java.util.*;
public class MaxNumber {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int[] num = new int[10];
        int max = 0;
        for(int i=0 ; i < 10; i = i + 1) {
            num[i] = sn.nextInt();
            if(max < num[i]) {
                max = num[i];
            }
        }
        System.out.println("Max Number : " + max);
    }
}