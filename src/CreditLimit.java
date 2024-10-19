import java.util.Scanner;
public class CreditLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int counter = 1;
        int creditLimit = 1000;
        int newBalance = 0;

        System.out.println("Enter Account Number:");
        System.out.println("Enter Account Number:");
        int accountNumber = sc.nextInt();

        System.out.println("Enter Balance for this month:");
        int balance = sc.nextInt();

        System.out.println("Enter charges for this month:");
        int charges = sc.nextInt();

        System.out.println("Total Credits charged for this month:");
        int creditCharges = sc.nextInt();

        while (counter <=10) {
            newBalance = (balance + charges) - creditCharges;
            total += newBalance;
            counter++;
            System.out.println("New Balance for this month: " + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit Limit Exceeded");
            }
            System.out.println("Enter account number:");
            accountNumber = sc.nextInt();
            System.out.println("Enter balance for this month:");
            balance = sc.nextInt();
            System.out.println("Enter charges for this month:");
            charges = sc.nextInt();
            System.out.println("Total Credits charged for this month:");
            creditCharges = sc.nextInt();


        }

    }
}
