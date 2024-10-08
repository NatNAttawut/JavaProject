import java.util.*;

public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);

    System.out.print("กรอกเลขบัญชี : ");
    int Accnum = sn.nextInt();

    System.out.print("กรอกชื่อ : ");
    String Name = sn.nextLine();

    System.out.print("กรอกที่อยู่ : ");
    String Address = sn.nextLine();

    System.out.print("จำนวนเงินในบัญชี : ");
    String Money = sn.nextLine();

    int i = Integer.parseInt(String.valueOf(Accnum));

    int count = 0;

    while (Accnum > 0) {
        Accnum /= 10;
        ++count;
    }

    System.out.println("Number of digits: " + count);

    if (count > 10) {
        System.out.println("โปรดกรอกเลขบัญชีให้ถูกต้อง");
    } else if (count == 10) {


        System.out.println("บัญชีเงินฝากออมทรัพย์ (Saving account)");
        System.out.println(Accnum);
        System.out.println(Name);
        System.out.println(Address);
        System.out.println(Money);

    }
}


