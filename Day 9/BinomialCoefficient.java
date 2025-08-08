import java.util.Scanner;

public class BinomialCoefficient {

    public static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of r:");
        int r = sc.nextInt();

        double result = fact(n) / (fact(r) * fact(n - r));
        System.out.println("Your Binomial Cofficient is: " + result);

    }

}