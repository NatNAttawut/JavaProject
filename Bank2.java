//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public static class Bank {
//    String Accnum;
//    String Name;
//    int Address;
//    int Money;
//
//    int i = Integer.parseInt(String.valueOf(Accnum));
//
//
//    int count = 0;
//
//        while (Accnum != 0) {
//        Accnum = Accnum / 10;
//        ++count;
//    }
//
//        System.out.println("Number of digits: " + count);
//
//}
//
//public void main(String[] args) {
//    Scanner sn = new Scanner(System.in);
//    Bank s = new Bank();
//    try {
//        System.out.print("เลขบัญชี : ");
//        s.Accnum = sn.nextLine();
//        System.out.print("ชื่อ : ");
//        s.Name = sn.nextLine();
//        System.out.print("ที่อยู่ : ");
//        s.Address = sn.nextInt();
//        System.out.print("จำนวนเงิน : ");
//        s.Money = sn.nextInt();
//
//
//
//    } catch (InputMismatchException e) {
//        System.out.println("Input Error!!!");
//    }
//}
//
