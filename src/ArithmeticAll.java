import java.util.Scanner;
public class ArithmeticAll {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int a = sc.nextInt();

        System.out.println("Enter the second integer: ");
        int b = sc.nextInt();

        System.out.println("Enter the third integer: ");
        int c = sc.nextInt();

        int sum = a + b + c;
        System.out.printf("The sum is: %d%n", sum);

        int average = sum / 3;
        System.out.printf("The average is: %d%n", average);

        int product = a * b * c;
        System.out.printf("The product is: %d%n", product);

        if (a>b && a> c )
            System.out.printf("The largest: %d%n", a);
        if (b>c && b> a )
            System.out.printf("The largest: %d%n", b);
        if (c>a && c>b )
            System.out.printf("The largest: %d%n", c);
        if (a<b && a<c )
            System.out.printf("The Smallest: %d%n",a);
        if (b<c && b<a )
            System.out.printf("The Smallest: %d%n", b);
        if (c<a && c<b )
            System.out.printf("The Smallest: %d%n", c);
    }
}
