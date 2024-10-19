import java.util.Scanner;
public class SideSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = 0;
        while (side <1 || side >20) {
            System.out.print("Enter side: ");
            side = sc.nextInt();
            if (side <1 || side >20) {
                System.out.printf("Invalid side. The side must be between 1 and 20 %n");
            }
        }int area = side * side;
        System.out.println("Area of the square is:" + area);
    }
}
