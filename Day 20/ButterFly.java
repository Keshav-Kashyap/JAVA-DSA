//Day 20  Program 1st

import java.util.Scanner;

public class ButterFly {

    public static void innerLoop(int i, int n) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        for (int k = 1; k <= 2 * (n - i); k++) {
            System.out.print(" ");
        }
        for (int l = 1; l <= i; l++) {
            System.out.print("*");
        }
    }

    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {

            innerLoop(i, n);

            System.out.println();

        }

        for (int i = n; i > 0; i--) {
            innerLoop(i, n);

            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range:");
        int n = sc.nextInt();
        butterfly(n);
    }

}
