import java.util.*;
public class YatZy {
    public static void main(String[] args) {
        int dice = 1;
        while (dice < 7) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            }
            else{
                    System.out.println("Yatzy!");
                }
                dice++;
            }
        }
    }
