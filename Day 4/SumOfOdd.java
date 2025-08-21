import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, evenSum = 0, oddSum = 0;
        System.out.println("Enter 5 Numbers:");
        for (int i = 1; i <= 5; i++) {
            num = sc.nextInt();
            if (num % 2 == 0) {
                evenSum = evenSum + num;
            } else {
                oddSum = oddSum + num;
            }
        }

        System.out.println("Even Sum is " + evenSum);
        System.out.println("Odd Sum is " + oddSum);

    }
}
