import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner Kris = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = Kris.nextInt();
        System.out.println("Enter second number:");
        int b = Kris.nextInt();

        int sum = a + b;
//        System.out.println(sum);
        System.out.printf("the sum is %d%n",sum);

        int product = a * b;
//        System.out.println(product);
        System.out.printf("the product is %d%n",product);

        int difference = a - b;
//        System.out.println(difference);
        System.out.printf("the difference is %d%n",difference);

        int division = a / b;
//        System.out.println(division);
        System.out.printf("the division is %d%n " , division);
    }
    }

