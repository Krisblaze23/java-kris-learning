import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int sum = 0;
        while (sum <=4) {
            System.out.println("Enter number: ");
            int input = sc.nextInt();
            total = total + input;
            sum ++;
        } int average = total/5;
        System.out.println("The average is " + average);
    }
}
