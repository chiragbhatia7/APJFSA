import java.util.Scanner;

public class SwitchStatement {
    public void calc_grade(String grade) {
        switch (grade) {
            case "A":
                System.out.println("Congrats...your marks are in range of 80-100");
                break;

            case "B":
                System.out.println("Congrats...your marks are in range of 65-79");
                break;

            case "C":
                System.out.println("Congrats...your marks are in range of 50-64");
                break;

            case "D":
                System.out.println("Congrats...your marks are in range of 36-49");
                break;

            case "F":
                System.out.println("Congrats...your marks are in range of 0-35");
                break;

            default:
                System.out.println("Error...Inavlid grade");
        }
    }

    public void IfElseSwitching(int user_input) {
        int age = user_input;
        if (age >= 40 && age <= 65) {
            String shift = "First";
            switch (shift) {
                case "First":
                    System.out.println("First shift alloted 6am - 3px");
                    break;
                case "Second":
                    System.out.println("Second shift alloted 4px - 10pm");
                    break;

            }
        } else if (age >= 20 && age <= 40) {
            String shift1 = "General";
            switch (shift1) {
                case "Night":
                    System.out.println("Night shift alloted 9pm - 6am");
                    break;
                case "General":
                    System.out.println("General shift alloted 6am - 9pm");
                    break;

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter grade: ");
//        String grade = sc.next();
//        grade = grade.toUpperCase();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        SwitchStatement ss = new SwitchStatement();
//            ss.calc_grade(grade);

        ss.IfElseSwitching(age);
    }

}
