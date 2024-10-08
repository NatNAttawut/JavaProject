import java.util.*;
public class TestString1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String txt = sn.nextLine();
         int qwerty = txt.length();
        System.out.println("Lengh : " + qwerty);
         int index = txt.indexOf("e",0);
         index++;
         if (index > 0) {
             System.out.println("Index is :  " + index);
         }
         else {
             System.out.println("Not Found");
         }

    }
}
