import java.util.*;


public class MethodVowel {
    static int Vowel(String Input) {
        int Count = 0;
        Input = Input.toUpperCase();
        for (int i = 0; i < Input.length(); i++) {
            char ch = Input.charAt(i);
            // ตรวจสอบว่าตัวอักษรนั้นเป็นสระหรือไม่
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                Count++;
            }

        }

        return Count;
    }

public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);

    System.out.print("Your Sentence: ");
    String input = sn.nextLine();

    int vowelCount = Vowel(input);

    System.out.println("Vowels in a Sentence: " + vowelCount);
}
}

