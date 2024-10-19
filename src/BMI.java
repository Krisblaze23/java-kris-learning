import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the weight in kilograms");
        double WK = sc.nextDouble();
        // WK is Weight in Kilograms

        System.out.println("Enter the height in meters");
        double HM = sc.nextDouble();
        // HM is Height in Meters

        double BMI = WK / (HM * HM);
        System.out.printf("BMI is %.2f%n ", BMI);
        // BMI is Body Mass Index

         if (BMI < 18.5) {
             System.out.println("Underweight");
         }
         if (BMI >= 18.5 && BMI <= 24.9) {
             System.out.println("Normal");
        }
         if (BMI >= 25 && BMI <= 29.9) {
             System.out.println("Overweight");
        }
         if (BMI >= 30 && BMI <= 39.9) {
             System.out.println("Obesity");
        }
        System.out.println("BMI VALUES");

        System.out.println("Underweight: less than 18.5 ");

        System.out.println("Normal: between 18.5 and  24.9 ");

        System.out.println("Overweight: between 25.9 and  29.9 ");

        System.out.println("Obesity: between 30 or greater ");

    }
}

