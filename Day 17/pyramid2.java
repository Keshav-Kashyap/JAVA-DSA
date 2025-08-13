import java.util.Scanner;

class pyramid2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Range:");
        int range = sc.nextInt();

        for (int i = 1; i <= range; i++) {

            for (int j = 1; j <= range - i; j++) {

                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {

                System.out.print("*");

            }
            System.out.println();

        }
    }
}