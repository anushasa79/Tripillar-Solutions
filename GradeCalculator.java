import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks (0-100): ");
        int marks = scanner.nextInt();
        scanner.close();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks entered!");
            return;
        }
        int gradeCategory = marks / 10;
        char grade;
        switch (gradeCategory) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }

        System.out.println("The corresponding grade is: " + grade);
    }
}
