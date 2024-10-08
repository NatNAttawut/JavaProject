import java.util.*;

interface StudentData{
    public void data();
}

interface StudentResult{
    public void CalGrade();
}

class Student2 implements StudentData,StudentResult{
    @Override
    public void data() {
        String Name = "Name : Somsak kuamlao";
        String Major = "Major : Software Engineer";
        System.out.println(Name + "\n" + Major);
    }

    @Override
    public void CalGrade() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Score : ");
        int Score = sn.nextInt();
        if(Score > 80){
            System.out.println("Grad A");
        } else if (Score > 70 && Score < 79) {
            System.out.println("Grade B");
        } else if (Score > 60 && Score < 69) {
            System.out.println("Grade C");
        } else if (Score > 50 && Score < 59) {
            System.out.println("Grad D");
        } else {
            System.out.println("Grad F You Loser");
        }
    }
}

public class StudentGrade {
    public static void main(String[] args) {
        Student2 std = new Student2();
        std.data();
        std.CalGrade();
    }
}