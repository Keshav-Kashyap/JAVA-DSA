import java.util.Scanner;

public class Zero_One {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Range:");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                if (count == 0) {
                    count = 1;
                } else {
                    count = 0;
                }
                System.out.print(" " + count);

            }

            System.out.println();
        }

    }

}
