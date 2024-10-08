import java.util.*;

public class InputCharDetect {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Please enter text or numbers : ");
        char a = sn.next().charAt(0);

        try {
            switch (a) {
                case '0':
                    System.out.println("The data received is : Number ");
                    break;
                case '1':
                    System.out.println("The data received is : Number");
                    break;
                case '2':
                    System.out.println("The data received is : Number");
                    break;
                case '3':
                    System.out.println("The data received is : Number");
                    break;
                case '4':
                    System.out.println("The data received is : Number");
                    break;
                case '5':
                    System.out.println("The data received is : Number");
                    break;
                case '6':
                    System.out.println("The data received is : Number");
                    break;
                case '7':
                    System.out.println("The data received is : Number");
                    break;
                case '8':
                    System.out.println("The data received is : Number");
                    break;
                case '9':
                    System.out.println("The data received is : Number");
                    break;
                default:
                    System.out.println("The data received is: character");
            }
        }
        catch (InputMismatchException e){
            System.out.println("Error");
        }
    }
}
