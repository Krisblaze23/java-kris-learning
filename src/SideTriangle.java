import java.util.Scanner;
public class SideTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int side  = 0;
        while (side<=3) {
            System.out.println("Enter side of a triangle:");
            int sideLength = sc.nextInt();

            total = total + sideLength;
            side ++;

            if (sideLength <1 || sideLength >20) {
                System.out.println("Invalid side:");

            }int perimeter = sideLength * sideLength * sideLength;
            System.out.println("Perimeter of a triangle:"+perimeter);

        }
    }
}
