import java.util.Scanner;
public class ComparingInteger {
    public static void main(String[] args) {
        Scanner kr = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int a = kr.nextInt();
        System.out.println("Enter second integer: ");
        int b = kr.nextInt();

        if (a == b)
            System.out.printf("the numbers are equal %d==%d%n" ,a,b);
        if (a > b)
            System.out.printf("the number is larger %d%n", a);
        else if (b > a)
            System.out.printf("the number is larger %d%n", b);

    }
}
