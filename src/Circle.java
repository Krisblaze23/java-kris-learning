import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of Circle:");
        int radius = sc.nextInt();
        double area = Math.PI * radius * radius;
        System.out.println("Area = " + area);

        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter = " + perimeter); 

    }
}
