import java.util.*;
public class SwitchVowel1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Please enter the letters A - Z or a - z : ");
        try {
            String a = sn.nextLine();
            a = a.toUpperCase();
            char ch = a.charAt(0);
            switch (ch) {
                case 'A':
                    System.out.println("Vowel");
                    break;
                case 'E':
                    System.out.println("Vowel");
                    break;
                case 'I':
                    System.out.println("Vowel");
                    break;
                case 'O':
                    System.out.println("Vowel");
                    break;
                case 'U':
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Consonant");
                    break;
            }
        }
        catch (InputMismatchException c) {
                System.out.print("Error");
            }
        }
    }
