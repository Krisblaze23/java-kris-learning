import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int count = 0;
        int totalMileage = 0;
        int totalGas = 0;

        System.out.println("***GAS MILEAGE***");

        System.out.println("Enter Driver's Name:");
        char driverName = sc.next().charAt(0);

        System.out.println("Enter the distance driven in miles: ");
        int md = sc.nextInt();
        // MD (Miles Driven)

        System.out.println("Enter the gallons used in litres: ");
        int lg = sc.nextInt();
        // lg (litres)

        while (md != -1 || lg != -1) {

            double MPG = (double) md / lg;
            System.out.printf("Miles Driven: %d%n", md);
            System.out.printf("Gallons Used: %d%n", lg);
            System.out.printf("Miles Per Gallon: %.2f%n ", MPG);


            totalMileage += md;
            totalGas += lg;
            total += (md + lg);
            count++;
            System.out.printf("Total mileage: %d%n", total);
            double combinedMPG = (double) totalMileage / totalGas;
            System.out.printf("Combined MPG: %.2f%n", combinedMPG);

            System.out.println("Enter Driver's Name:");
            driverName = sc.next().charAt(0);

            System.out.println("Enter the distance driven in miles: ");
            md = sc.nextInt();

            System.out.println("Enter the gallons used in litres: ");
            lg = sc.nextInt();


        }
        if (count != 0) {

            double MPG = (double) md / lg;
            System.out.printf("Miles Driven: %d%n", md);
            System.out.printf("Gallons Used: %d%n", lg);
            System.out.printf("Miles Per Gallon: %.2f ", MPG);


        } else {

            System.out.println("Wrong input");
        }
    }
}