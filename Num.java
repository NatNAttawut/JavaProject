import java.util.*;

interface Mynumber{
    public String findNumber(int[] num);
}

class MaxNum implements Mynumber {
    public String findNumber(int[] num) {
        String str = "";
        int Max = num[0];
        for(int i = 0; i < num.length ; i++){
            if (Max < num[i]){
                Max = num[i];
            }
        }
        str = " Max Num : " + Max;
        return str;

    }
}

public class Num {
    public static void main(String[] args) {
        MaxNum m = new MaxNum();
        int [] num2 = {10,20,300,40,50};
        for(int i=0 ; i < num2.length; i++){
            System.out.print(num2[i]+" ");
        }
        System.out.println("/n"+ m.findNumber(num2));
    }
}