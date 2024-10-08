import java.util.*;
public class Ascending {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int[] num = new int[10];
        int temp = 0;
        for(int i=0 ; i < 10; i = i + 1) {
            System.out.print("Enter Number : ");
            num[i] = sn.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if(num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for (int i : num){
            System.out.print(" " + i + " ");
        }
    }
}
