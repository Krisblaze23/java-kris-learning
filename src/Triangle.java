import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i =1; i <= 10;i++){
            for (int j =1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i =10; i >= 1; i--){
            for (int j =1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
