import java.util.Scanner;

public class TableRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range:");
        int range = sc.nextInt();
        System.out.println("Multiplication Table from 1 to " + range);
        for (int i = 1; i <= 10; i++) {
            System.out.println("");
            for (int j = 1; j <= range; j++) {
                int digit = i * j;
                System.out.printf("%4d", digit);
            }

        }

    }
}
