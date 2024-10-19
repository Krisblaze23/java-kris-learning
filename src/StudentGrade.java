import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name: ");
        String name = sc.nextLine();

        System.out.println("Enter student score: ");
        int score = sc.nextInt();

        if (score >= 90 ) {
            System.out.printf("Grade is A %n Passed");
        }else if (score >= 80 ){
            System.out.printf("Grade is B %n Passed");
        }else if (score >= 70 ){
            System.out.printf("Grade is C %n Passed");
        }else if (score >= 60 ){
            System.out.printf("Grade is D %n Passed");

        }else System.out.printf("Grade is F %n Failed");
        }
    }
