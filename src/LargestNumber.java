import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int counter = 1;
        int largest = Integer.MIN_VALUE;

        while (counter <=10) {
            System.out.println("Enter number of units sold:");
            int number = sc.nextInt();
            total += number;
            counter++;

            if (number > largest) {
                largest = number;

            }

        }
        System.out.printf("The total sold is %d%n " , total);
        System.out.printf("The largest number is: %d%n " , largest);
    }
}
