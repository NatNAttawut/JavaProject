import java.util.*;
public class CapitalLetter {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter Word : ");
        String s = sn.nextLine();
        int a = s.length();int upper = 0 , ascii = 0;
        if (a > 30){
            System.out.println("Error");
        }
        else {
            char [] ch = new char[30];

            for (int i = 0; i < a; i++) {
                ch[i] = s.charAt(i);
                if ((ascii = ch[i]) <= 90 && (ascii = ch[i]) >= 65){
                    upper++;
                }
            }
        }
        System.out.println("Number of characters : " + a);
        System.out.println("Upper : " + upper);
    }
}
