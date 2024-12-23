
public class Interest {
    public static void main(String[] args) {
        double amount;
        double principal = 1000;
        double rate = 0.05;

        System.out.printf("%s%20s%n", "Year", "Amount On Deposit");

        for (int year = 1; year <= 6; year++) {
            amount = principal * Math.pow(1 + rate, year);
            System.out.printf("%4d%20.2f%n", year, amount);
            rate += 0.01;
        }
    }
}
