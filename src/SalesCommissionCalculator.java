import java.util.Scanner;
public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int counter = 1;

        while (counter <= 10) {
            System.out.println("Enter item number:");
            int item = sc.nextInt();
            System.out.println("Enter the amount to calculate the sales commission:");
            int amount = sc.nextInt();

            total = total + amount;
            counter++;
            double commission = (200 +(0.09) * amount);
            System.out.println("Item: " + item);
            System.out.printf("Sales commission: %.2f%n " , commission);
        }
        System.out.println("Total amount:" +total);
    }
}
