import java.time.chrono.MinguoEra;
import java.util.Scanner;
public class SmallestValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int smallest = Integer.MAX_VALUE;


        for (int i = 1; i <=5; i++){
            System.out.println("Enter number " + i + ": ");
            int number = sc.nextInt();
            if (number < smallest){
                smallest = number;
            }
        }
        System.out.println("The smallest value:" + smallest);
    }
}
