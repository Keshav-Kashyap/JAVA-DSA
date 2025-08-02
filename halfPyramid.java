import java.util.Scanner;

public class halfPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range:");
        int range = sc.nextInt();

        for (int i = 1; i <= range; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j);

            }
            System.out.println();
        }

    }
}
