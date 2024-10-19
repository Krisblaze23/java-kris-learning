import java.util.Scanner;
public class CCR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10) {
            System.out.println("Enter the next grade:");
            int grade = sc.nextInt();
            total = total + grade;
            gradeCounter++;
        }

        double average = (double)total / 10;
        System.out.printf("%n The Total of all the grades is: %d%n", total);
        System.out.printf("The average grade is: %.2f%n " , average);
    }
}
