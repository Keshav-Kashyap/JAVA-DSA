import java.util.Scanner;

class pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Range:");
        int range = sc.nextInt();

        for (int i = 1; i <= range; i++) {
            for (int j = range; j >= i; j--) {
                System.out.print("_");

            }
            System.out.println();
        }

    }
}