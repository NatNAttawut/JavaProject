import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Plese Enter Number : ");
        int a = sn.nextInt();
        int i = 0;
        for(i=1 ; i <= 12 ; i = i+1){
            System.out.println(a + "*" + i + "=" + (a * i));
        }

    }
}
