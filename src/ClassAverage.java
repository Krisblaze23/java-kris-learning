import java.util.Scanner;
public class ClassAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.println("Enter the next grade or -1 to quit the program:");
        int grade = sc.nextInt();

        while (grade != -1) {
            total = total + grade;
            gradeCounter++;
            System.out.println("Enter the next grade or -1 to quit the program:");
            grade = sc.nextInt();
        }

        if (gradeCounter != 0) {

            double average = (double) total / gradeCounter;

            System.out.printf("Class average %.2f%n" , average);

        }else
            System.out.println("no grades found");

    }
        }


