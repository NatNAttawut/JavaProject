import java.util.*;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Your Sentence: ");
        try {
            String str = sn.nextLine();
            int num = str.length();
            int vowel = 0, consonant = 0;
            for (int i = 0; i < num; i++) {
                int j = i + 1;
                if (str.substring(i, j).equalsIgnoreCase("a") || str.substring(i, j).equalsIgnoreCase("e") ||
                        str.substring(i, j).equalsIgnoreCase("i") || str.substring(i, j).equalsIgnoreCase("o") ||
                        str.substring(i, j).equalsIgnoreCase("u")) {
                    vowel++;
                }
                consonant++;
            }
            System.out.println("Vowel : " + vowel);
            System.out.println("Consonant : " + consonant);
        }

        catch (InputMismatchException e) {
            System.out.println("Please Enter Vowel and Consonant");
        }

    }
}